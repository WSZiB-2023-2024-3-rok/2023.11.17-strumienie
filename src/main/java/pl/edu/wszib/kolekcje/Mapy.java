package pl.edu.wszib.kolekcje;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapy {
    public static void main(String[] args) {
        HashMap<Integer, String> mapa = new HashMap<>();

        mapa.put(5, "Janusz");
        mapa.put(7, "Wiesiek");
        mapa.put(10, "Zbyszek");

        System.out.println(mapa.size());

        System.out.println(mapa.get(10));

        HashMap<String, String> mapa2 = new HashMap<>();

        mapa2.put("gh23hg3", "Janusz");
        mapa2.put("543kjh6g", "Wiesiek");
        mapa2.put("654kjhh3", "Zbyszek");

        System.out.println(mapa2.get("543kjh6g"));

        Set<String> keys = mapa2.keySet();
        System.out.println(keys);
        Collection<String> values = mapa2.values();
        System.out.println(values);

        Set<Map.Entry<String, String>> pary = mapa2.entrySet();
        for(Map.Entry<String, String> jednaPara : pary) {
            System.out.println(
                    "Klucz: " + jednaPara.getKey() +
                    " Wartosc: " + jednaPara.getValue());
        }
    }
}
