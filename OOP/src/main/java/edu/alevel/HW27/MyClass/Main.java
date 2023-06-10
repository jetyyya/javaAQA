package edu.alevel.HW27.MyClass;

import edu.alevel.HW27.MyCity.Buildings;

public class Main {
    public static void main(String[] args) {
        System.out.println("Частина перша");

            Buildings[] buildings = new Buildings[5];
            buildings[0] = new Buildings("Empire State Building", 102);
            buildings[1] = new Buildings("Burj Khalifa", 163);
            buildings[2] = new Buildings("Eiffel Tower", 3);
            buildings[3] = new Buildings("Shanghai Tower", 128);
            buildings[4] = new Buildings("Petronas Towers", 88);

            // Вивід інформації про будівлі
            for (Buildings building : buildings) {
                System.out.println("Назва будівлі: " + building.getName());
                System.out.println("Кількість поверхів: " + building.getFloors());
                System.out.println();
        }
        System.out.println("Частина друга");

            MyInt a1 = new MyInt(3);
            MyInt a2 = a1;

            System.out.println("Значення a1.x: " + a1.getX());
            System.out.println("Значення a2.x: " + a2.getX());

            a1.setX(5);

            System.out.println("Змінене значення a1.x: " + a1.getX());
            System.out.println("Значення a2.x після зміни a1.x: " + a2.getX());

        System.out.println("Частина третя");
            Point[] points = new Point[4];
            points[0] = new Point(1, 2);
            points[1] = new Point(3, 4);
            points[2] = new Point(5, 6);
            points[3] = new Point(6, 8);

            System.out.println("Всі точки:");
            for (Point point : points) {
                point.info();
            }

            System.out.println("Точки, у яких координати x та y кратні 2:");
            for (Point point : points) {
                if (point.getX() % 2 == 0 && point.getY() % 2 == 0) {
                    point.info();
                }
            }
    }
}