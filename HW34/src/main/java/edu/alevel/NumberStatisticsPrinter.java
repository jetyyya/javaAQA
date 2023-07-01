package edu.alevel;
import java.util.IntSummaryStatistics;

public class NumberStatisticsPrinter {
    public static void printStatistics(IntSummaryStatistics stats) {
        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Average: " + stats.getAverage());
    }
}