package pl.edu.wszib.funkcyjny;

import pl.edu.wszib.anonimowe.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.*;

public class App2 {
    public static void main(String[] args) {
        //System.out.println(readFromDbAndAdd());
        //System.out.println(readFromFileAndAdd());
        //System.out.println(readFromFileAndMultiply());

        System.out.println(readAndProcess(() -> 5, () -> 10, (x,y) -> x+y));
        System.out.println(readAndProcess(() -> 78, () -> 15, (x,y) -> x+y));
        System.out.println(readAndProcess(() -> 5, () -> 10, (x,y) -> x*y));

        algorytm(() -> 14, System.out::println);

        Optional<Car> carBox = findCar("kajshdgf");
        if(carBox.isPresent()) {
            //Car car = carBox.get();
            System.out.println(carBox.get().getBrand());
        }

        Car car = carBox.orElse(new Car("default1", "default", 100));
        Supplier<Car> defaultCarSupplier = () -> new Car("default1", "default", 100);
        Car car2 = carBox.orElseGet(defaultCarSupplier);

        carBox.ifPresent(System.out::println);
        carBox.ifPresentOrElse(System.out::println, () -> System.out.println("carBox jest pusty !!"));
        carBox.or(() -> Optional.of(defaultCarSupplier.get()));
        Optional<String> brandBox = carBox.map(Car::getBrand);
        /*try {
            carBox.get();
        } catch (NoSuchElementException e) {
            throw new BrakAutaException();
        }*/
        carBox.orElseThrow(BrakAutaException::new);
    }

    static int readFromDbAndAdd() {
        System.out.println("Wczytuje z bazy !!");
        int x = 5;
        int y = 10;
        System.out.println("Adding !!");
        int sum = x + y;
        return sum;
    }

    static int readFromFileAndAdd() {
        System.out.println("Wczytuje z pliku !!");
        int x = 5;
        int y = 10;
        System.out.println("Adding !!");
        int sum = x + y;
        return sum;
    }

    static int readFromFileAndMultiply() {
        System.out.println("Wczytuje z pliku !!");
        int x = 5;
        int y = 10;
        System.out.println("Adding !!");
        int sum = x * y;
        return sum;
    }

    static int readAndProcess(Supplier<Integer> xSupplier,
                              Supplier<Integer> ySupplier,
                              BiFunction<Integer, Integer, Integer> processor) {
        System.out.println("Reading !!");
        int x = xSupplier.get();
        int y = ySupplier.get();
        System.out.println("Processing !!");
        int result = processor.apply(x, y);
        return result;
    }

    static void algorytm(Supplier<Integer> dataLoader, Consumer<Integer> dataSaver) {
        int data = dataLoader.get();
        //k1
        System.out.println("krok 1 !!");
        //k2
        System.out.println("krok 2 !!");
        //k3
        System.out.println("krok 3 !!");
        int wyniki = 5;
        dataSaver.accept(wyniki);
    }

    public static Optional<Car> findCar(String brand) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "3", 100));
        cars.add(new Car("Audi", "A5", 200));
        cars.add(new Car("Toyota", "Corolla", 50));

        for(Car car : cars) {
            if(car.getBrand().equals(brand)) {
                return Optional.of(car);
            }
        }

        return Optional.empty();
    }
}
