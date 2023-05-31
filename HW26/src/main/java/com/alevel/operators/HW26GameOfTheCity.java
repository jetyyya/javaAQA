package com.alevel.operators;
import java.util.Scanner;

public class HW26GameOfTheCity {
    public static void main(String[] args) {
        String[] cities = generateCitiesArray();
        playCitiesGame(cities);
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

        System.out.println("Давайте пограємо у «Міста». Для початку треба ввести назву будь-якого міста. Ваш хід!");
        System.out.println("Граємо українською. Ваш хід!");

        String lastCity = scanner.nextLine();
        char lastLetter = Character.toUpperCase(lastCity.charAt(lastCity.length() - 1));

        while (true) {
            boolean foundCity = false;
            for (int i = 0; i < cities.length; i++) {
                String city = cities[i];
                if (Character.toUpperCase(city.charAt(0)) == lastLetter) {
                    System.out.println("Місто: " + city);
                    lastLetter = Character.toUpperCase(city.charAt(city.length() - 1));
                    cities[i] = "used";
                    foundCity = true;
                    break;
                }
            }

            if (!foundCity) {
                System.out.println("Комп'ютер не знайшов жодного міста на літеру " + "'" + Character.toLowerCase(lastLetter) + "'" + ", та програв");
                break;
            }

            System.out.println("Ваш хід: (або введіть 'exit', щоб завершити гру)");
            String playerCity = scanner.nextLine();
            if (playerCity.equalsIgnoreCase("exit")) {
                break;
            }
            char firstLetter = Character.toUpperCase(playerCity.charAt(0));
            if (firstLetter != lastLetter) {
                System.out.println("Введена назва міста не починається на літеру " + "'" + Character.toLowerCase(lastLetter) + "'");
                System.out.println("Ви програли!");
                break;
            }
            lastLetter = Character.toUpperCase(playerCity.charAt(playerCity.length() - 1));
        }
        System.out.println("Гра закінчена");
    }
}