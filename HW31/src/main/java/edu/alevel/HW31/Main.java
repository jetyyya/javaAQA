package edu.alevel.HW31;

public class Main {
    public static void main(String[] args) {
        City kyiv = new City("Київ", 50.4547, 30.5238);

        DistanceCalculator calculator = new DistanceCalculator();

        UserInput userInput = new UserInput();

        City destination = userInput.getCityFromUser();

        double distance = calculator.calculateDistance(kyiv, destination);

        System.out.println("Відстань від м. Київ до " + destination.getName() + ": " + distance + " км");
    }
}