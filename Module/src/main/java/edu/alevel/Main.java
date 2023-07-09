package edu.alevel;

import edu.alevel.module.LinkedListDen;
import edu.alevel.module.ListDen;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ListDen<String> list = new LinkedListDen<>();

        list.add("a");
        list.add("b");
        list.add("d");
        list.add("c");
        list.add("e");
        System.out.println(list);

        list.add(3, "F");
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.update(0, "A");
        System.out.println(list);

        System.out.println(list.get(0));

        System.out.println("Розмір: " + list.size());

    }
}