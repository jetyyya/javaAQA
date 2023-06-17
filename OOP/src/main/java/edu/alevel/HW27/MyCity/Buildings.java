package edu.alevel.HW27.MyCity;

public class Buildings {
    private String name;
    private int floors;

    public Buildings(String name, int floors) {
        this.name = name;
        this.floors = floors;
    }

    public String getName() {
        return name;
    }

    public int getFloors() {
        return floors;
    }
}
