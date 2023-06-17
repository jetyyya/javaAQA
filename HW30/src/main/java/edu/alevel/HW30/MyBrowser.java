package edu.alevel.HW30;

public class MyBrowser implements CanBeClosed {
    @Override
    public void close() {
        System.out.println("Закриваю браузер");
    }
}