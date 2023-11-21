package pl.edu.wszib.kolekcje;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class App {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        System.out.println(list.size());

        list.add("Janusz");

        System.out.println(list.size());

        list.add("Wiesiek");
        list.add("Karol");

        System.out.println(list.size());

        System.out.println(list.get(0));

        list.remove("Wiesiek");
        list.remove(0);

        System.out.println(list.size());

        System.out.println(list);

        System.out.println(list.contains("Karol1"));
    }
}
