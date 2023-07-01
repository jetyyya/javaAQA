package edu.alevel;
import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class task2 {
    public static void main(String[] args) {
        int[] numbers = NumberGenerator.generateRandomNumbers(100);

        IntSummaryStatistics stats = Arrays.stream(numbers)
                .filter(num -> num >= 0)
                .summaryStatistics();

        NumberStatisticsPrinter.printStatistics(stats);
    }
}
