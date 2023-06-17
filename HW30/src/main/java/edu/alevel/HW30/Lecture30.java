package edu.alevel.HW30;

public class Lecture30 {
    public static void main(String[] args) {
        MyBrowser browser = new MyBrowser();
        MyFile file = new MyFile();

        finishWork(browser);

        finishWork(file);

        finishWork(new CanBeClosed() {
            @Override
            public void close() {
                System.out.println("Закриваю анонімний об'єкт");
            }
        });

        CanBeClosed browser2 = () -> System.out.println("Закриваю лямбда браузер");
        finishWork(browser2);

        CanBeClosed file2 = () -> System.out.println("Закриваю лямбда файл");
        finishWork(file2);
    }

    // Статичний метод finishWork, який викликає метод close() для об'єктів CanBeClosed
    public static void finishWork(CanBeClosed obj) {
        obj.close();
    }
}
