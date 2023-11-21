package pl.edu.wszib.abstrakcja;

public class AlgorytmPlikowy extends Algorytm {
    @Override
    public void wczytajDane() {
        System.out.println("Wczytuje dane z pliku !");
    }

    @Override
    public void zapiszWynik() {
        System.out.println("Zapisuje dane do pliku !");
    }
}
