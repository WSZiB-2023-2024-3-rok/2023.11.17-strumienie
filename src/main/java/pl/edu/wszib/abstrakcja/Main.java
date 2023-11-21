package pl.edu.wszib.abstrakcja;

public class Main {
    public static void main(String[] args) {
        Algorytm algorytm = new AlgorytmPlikowy();
        algorytm.policz();

        Algorytm algorytm2 = new AlgorytmBazowy();
        algorytm2.policz();

        Algorytm algorytm3 = new AlgorytmTrudny();
        algorytm3.policz();
    }
}
