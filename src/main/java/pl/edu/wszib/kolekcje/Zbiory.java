package pl.edu.wszib.kolekcje;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Zbiory {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        System.out.println(set.size());

        set.add("Janusz");
        set.add("Zbyszek");
        set.add("Wiesiek");
        set.add("Adam");

        System.out.println(set.size());

        System.out.println(set);

        set.remove("Zbyszek");

        System.out.println(set.size());

        for(String imie : set) {
            System.out.println(imie);
            //set.remove(imie);
        }

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String imie = iterator.next();
            System.out.println(imie);
            if(imie.equals("Adam")) {
                iterator.remove();
            }
        }

        System.out.println(set);

        set.add("Wiesiek");
        System.out.println(set);
    }
}
