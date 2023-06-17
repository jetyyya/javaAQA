package com.alevel.operators;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашне завдання №25");
        System.out.println("Частина перша(масиви)"); //Створити масив з 10 числами та виведи їх у рядок через ";"
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + ";");
        }
        System.out.print("\n" + "Частина друга(масиви)"); //Створити змінну з рядком "Мама мила раму". Створити масив зі всіх слів які зустрічаються у цьому рядку.
            String string = "Мама мила раму";
            String[] words = string.split( " ");
        System.out.print("\n" + "Частина третя(масиви)");//Створити рядок "Я хочу перенесення рядків". Змінити всі символи пробілу на символи перенесення рядків та вивести у консоль
            String text = " Я хочу перенесення рядків";
            String result = text.replace(" ", "\n");

            System.out.println(result);
        System.out.print("\n" + "Частина четверта(масиви)");//Створити масив із цілих чисел і поместить одразу 10 значень. Пройтися ними та змінити значення
            int[] numbers2 = new int[10];

            for (int i = 0; i < numbers2.length; i++) {
                numbers[i] = i + 1;
            }

            for (int i = 0; i < numbers2.length; i++) {
                numbers[i] *= 2;
            }

            for (int i = 0; i < numbers2.length; i++) {
                System.out.println(numbers[i]);
        }
        System.out.print("\n" + "Частина п'ята(масиви)");//Створити масив із дробових чисел(5 елементів)
            double[] numbers3 = {1.5, 2.3, 3.7, 4.2, 5.9};
        System.out.print("\n" + "Частина шоста(масиви)");//Створити 3 змінних такого типу byte, int, long. Створити масив типу int. Спробувати покласти туди змінні
            byte byteVariable = 10;
            int intVariable = 20;
            long longVariable = 30;

            int[] intArray = new int[3];
            intArray[0] = byteVariable;
            intArray[1] = intVariable;
            intArray[2] = (int) longVariable;
        System.out.print("\n" + "Частина сьома(масиви)"+ "\n");//Створити будь-який двомірний масив. Заповнити його будь-якими даними. Вивести у консоль
            int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
        }
    }
}