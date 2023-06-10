package com.alevel.operators;
import java.util.Scanner;

public class HW26GameOfTheCity {
    public static void main(String[] args) {
        String[] cities = generateCitiesArray();
        playCitiesGame(cities);
        System.out.println("Гра закінчена");
    }

    public static String[] generateCitiesArray() {
        String[] cities = {
                "Харків", "Амстердам", "Варшава", "Лондон", "Київ",
                "Мадрид", "Москва", "Париж", "Рим", "Берлін",
                "Токіо", "Сідней", "Осло", "Стокгольм", "Відень",
                "Будапешт", "Лісабон", "Копенгаген", "Афіни", "Дублін"
        };

        return cities;
    }

    public static void playCitiesGame(String[] cities) {
        Scanner scanner = new Scanner(System.in);

        printGameInstructions();

        String lastCity = scanner.nextLine();
        char lastLetter = Character.toUpperCase(lastCity.charAt(lastCity.length() - 1));

        while (true) {
            String city = findCity(cities, lastLetter);
            if (city == null) {
                printComputerLost(lastLetter);
                break;
            }
            printCity(city);
            lastLetter = Character.toUpperCase(city.charAt(city.length() - 1));
            removeCity(cities, city);

            String playerCity = getPlayerCity(scanner);
            if (playerCity.equalsIgnoreCase("exit")) {
                break;
            }
            char firstLetter = Character.toUpperCase(playerCity.charAt(0));
            if (firstLetter != lastLetter) {
                printInvalidCityInput(lastLetter);
                break;
            }
            lastLetter = Character.toUpperCase(playerCity.charAt(playerCity.length() - 1));
        }
    }

    public static String findCity(String[] cities, char lastLetter) {
        for (String city : cities) {
            if (Character.toUpperCase(city.charAt(0)) == lastLetter) {
                return city;
            }
        }
        return null;
    }

    public static void removeCity(String[] cities, String city) {
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].equals(city)) {
                cities[i] = "used";
                break;
            }
        }
    }

    public static void printGameInstructions() {
        System.out.println("Давайте пограємо у «Міста». Для початку треба ввести назву будь-якого міста.");
        System.out.println("Граємо українською. Ваш хід!");
    }

    public static void printCity(String city) {
        System.out.println("Місто: " + city);
    }

    public static void printComputerLost(char lastLetter) {
        System.out.println("Комп'ютер не знайшов жодного міста на літеру " + "'" + Character.toLowerCase(lastLetter) + "'" + ", та програв");
    }

    public static String getPlayerCity(Scanner scanner) {
        System.out.println("Ваш хід: (або введіть 'exit', щоб завершити гру)");
        String input = " ";
        do {
            input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("Пустий ввід! Введіть назву міста.");
            }
        } while (input.isEmpty());
        return input;

    }

    public static void printInvalidCityInput(char lastLetter) {
        System.out.println("Введена назва міста не починається на літеру " + "'" + Character.toLowerCase(lastLetter) + "'");
        System.out.println("Ви програли!");
    }
}