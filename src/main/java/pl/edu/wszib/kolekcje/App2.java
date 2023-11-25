package pl.edu.wszib.kolekcje;

import java.util.*;

public class App2 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Janusz");
        lista.add("Wiesiek");

        metoda1(lista);
        metoda2(lista);
        metoda3(lista);

        Map<Double, Integer> mapa = new HashMap<>();
        Set<String> set = new HashSet<>();
    }

    public static void metoda1(List<String> list) {
        System.out.println("metoda1 !!");
        System.out.println(list.size());
    }

    public static void metoda2(List<String> list) {
        System.out.println("metoda2 !!");
        System.out.println(list.isEmpty());
    }

    public static void metoda3(List<String> list) {
        System.out.println("metoda3 !!");
        System.out.println(list);
    }
}
