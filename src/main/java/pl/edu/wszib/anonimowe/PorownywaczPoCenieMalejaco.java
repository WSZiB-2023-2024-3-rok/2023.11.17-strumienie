package pl.edu.wszib.anonimowe;

import java.util.Comparator;

public class PorownywaczPoCenieMalejaco implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o2.getPrice() - o1.getPrice();
    }
}
