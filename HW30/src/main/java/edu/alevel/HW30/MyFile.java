package edu.alevel.HW30;

public class MyFile implements CanBeClosed {
    @Override
    public void close() {
        System.out.println("Закриваю файл");
    }
}