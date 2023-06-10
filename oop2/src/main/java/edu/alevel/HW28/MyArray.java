package edu.alevel.HW28;

public class MyArray {
    private String[] array;
    private int length;

    public MyArray() {
        array = new String[5];
        length = 0;
    }

    public int length() {
        return length;
    }

    public void put(String str) {
        if (length == array.length) {
            String[] newArray = new String[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }

        array[length] = str;
        length++;
    }

    public String get() {
        if (length == 0) {
            return null;
        }

        String firstElement = array[0];
        System.arraycopy(array, 1, array, 0, length - 1);
        length--;
        return firstElement;
    }

    public void printArray() {
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
