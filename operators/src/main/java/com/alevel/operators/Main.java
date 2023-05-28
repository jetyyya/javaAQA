package com.alevel.operators;

public class Main {
    public static void main(String[] args) {

        System.out.println("Practice");
        /*int[] array = new int[5];
        double[] array2 = {1.2, 2.3, 3.4, 4.5};*/
        int[] nums = new int[2];
        nums[0] = 1;
        nums[1] = 2;
        System.out.println(nums[1]);
        System.out.println("Homework 24");
        System.out.println("Перше завдання");{
            int x = 3;
            int y = 4;
            System.out.println(x + y);
            System.out.println("" + x + y);}
        System.out.println("Друге завдання з for");
            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        System.out.println("Друге завдання з while");
        {
            int i = 1;

            while (i <= 100) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
                i++;
            }
        }
        System.out.println("Друге завдання з while без if");
        int i = 2;
                while (i <= 100) {
            System.out.println(i); // Виведення парного числа
            i += 2;
        }
    }
}

