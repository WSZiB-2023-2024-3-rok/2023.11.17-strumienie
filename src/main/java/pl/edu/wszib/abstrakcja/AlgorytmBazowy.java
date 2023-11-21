package pl.edu.wszib.abstrakcja;

public class AlgorytmBazowy extends Algorytm{
    @Override
    public void wczytajDane() {
        System.out.println("Wczytuje dane z bazy !");
    }

    @Override
    public void zapiszWynik() {
        System.out.println("Zapisuje dane do bazy !");
    }
}
