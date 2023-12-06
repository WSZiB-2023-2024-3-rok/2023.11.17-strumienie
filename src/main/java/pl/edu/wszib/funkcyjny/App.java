package pl.edu.wszib.funkcyjny;

import pl.edu.wszib.anonimowe.Car;

import java.util.function.*;

public class App {
    public static void main(String[] args) {
        Function<Integer, String> function = x -> "Liczba: " + x;

        System.out.println(function.apply(5));
        System.out.println(function.apply(10));
        System.out.println(function.apply(20));

        BiFunction<Integer, String, Double> biFunction =
                (integer, string) -> 5.3 * (integer + string.length());

        System.out.println(biFunction.apply(10, "Janusz"));
        System.out.println(biFunction.apply(34, "Wiesiek"));
        System.out.println(biFunction.apply(23, "Zbyszek"));

        UnaryOperator<Integer> unaryOperator = x -> x * 10;

        System.out.println(unaryOperator.apply(5));
        System.out.println(unaryOperator.apply(10));
        System.out.println(unaryOperator.apply(50));

        Predicate<String> predicate = s -> s.length() > 6;

        System.out.println(predicate.test("Mateusz"));
        System.out.println(predicate.test("Zbyszek"));
        System.out.println(predicate.test("Jan"));

        Supplier<Car> supplier = () -> new Car("default", "default", 0);

        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());

        Consumer<Car> consumer = System.out::println;

        consumer.accept(new Car("BMW", "3", 100));
        consumer.accept(supplier.get());

        InterfejsFunkcyjny interfejsFunkcyjny = String::length;
        System.out.println(interfejsFunkcyjny.metoda("Janusz"));

        InterfejsFunkcyjny interfejsFunkcyjny2 = s -> {
            if(s.startsWith("J")) {
                return s.length() + 5;
            } else if(s.endsWith("k")) {
                return s.length() - 1;
            }
            return s.length();
        };

        System.out.println(interfejsFunkcyjny2.metoda("Janusz"));
        System.out.println(interfejsFunkcyjny2.metoda("Wiesiek"));
        System.out.println(interfejsFunkcyjny2.metoda("Karol"));
    }
}
