package edu.alevel;
import java.util.Arrays;


public class task3 {
    public static void main(String[] args) {
        int[] numbers = NumberGenerator.generateRandomNumbers(100);

        int minNumber = Arrays.stream(numbers)
                .reduce(Integer.MAX_VALUE, Math::min);

            System.out.println("Мінімальне число: " + minNumber);
    }
}