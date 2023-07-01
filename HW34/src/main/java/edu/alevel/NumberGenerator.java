package edu.alevel;
import java.util.Random;

public class NumberGenerator {
    public static int[] generateRandomNumbers(int count) {
        Random random = new Random();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = random.nextInt();
        }
        return numbers;
    }
}