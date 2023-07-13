package edu.alevel.HW31;
import java.util.Scanner;

public class UserInput implements UserInputInterface {
    private final Scanner scanner;

    public UserInput() {
        scanner = new Scanner(System.in);
    }

    @Override
    public City getCityFromUser() {
        System.out.print("Введіть назву міста: ");
        String cityName = scanner.nextLine();

        System.out.print("Введіть широту міста: ");
        double latitude = scanner.nextDouble();

        System.out.print("Введіть довготу міста: ");
        double longitude = scanner.nextDouble();

        return new City(cityName, latitude, longitude);
    }
}
