package pl.edu.wszib.anonimowe;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Janusz");
        list.add("Wiesiek");
        list.add("Adam");
        list.add("Mateusz");
        list.add("Zbyszek");

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "5", 123));
        cars.add(new Car("Audi", "A5", 345));
        cars.add(new Car("Toyota", "Corolla", 3245));
        cars.add(new Car("Kia", "Ceed", 8456));

        System.out.println(cars);

        Collections.sort(cars, (c1, c2) -> c1.getBrand().compareTo(c2.getBrand()));

        System.out.println(cars);

        Collections.sort(cars, (c1, c2) -> c1.getPrice() - c2.getPrice());

        System.out.println(cars);

        JakisInterfejs obiekt = new JakisInterfejs() {
            @Override
            public void x() {
                System.out.println("x !!");
            }

            @Override
            public void y() {
                System.out.println("y !!");
            }

            @Override
            public void z() {
                System.out.println("z !!");
            }
        };

        obiekt.x();
        obiekt.y();
        obiekt.z();

        Random random = new Random();
    }
}
