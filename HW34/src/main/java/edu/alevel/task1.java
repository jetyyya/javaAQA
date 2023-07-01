package edu.alevel;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        String[] strings = {"apple", "гранат", "cherry", "banana", "elderberry", "куркума", "апельсин"};

        Arrays.stream(strings)
                .sorted()
                .forEach(System.out::println);
    }
}
