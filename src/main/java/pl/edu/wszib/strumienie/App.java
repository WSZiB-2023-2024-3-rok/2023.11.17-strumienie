package pl.edu.wszib.strumienie;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<Integer> liczby = List.of(1,2,3,4,5,6,7,8,9,1,2,3,7,8,9);

        List<Integer> list = liczby.stream()
                .peek(x -> System.out.println("Liczba ze strumienia: " + x))
                .toList();

        System.out.println(list);
    }
}
