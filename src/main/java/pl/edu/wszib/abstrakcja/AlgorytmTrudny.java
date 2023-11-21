package pl.edu.wszib.abstrakcja;

public class AlgorytmTrudny extends Algorytm {
    @Override
    public void wczytajDane() {
        System.out.println("Wczytuje dane z internetu !");
    }

    @Override
    public void zapiszWynik() {
        System.out.println("Zapisuje dane do excela !");
    }
}
