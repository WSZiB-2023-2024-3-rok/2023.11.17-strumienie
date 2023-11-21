package pl.edu.wszib.abstrakcja;

public class App2 {
    public static void main(String[] args) {
        KlasaAbstrakcyjna klasaAbstrakcyjna = new ImplementacjaKlasyAbstrakcyjnej();
        klasaAbstrakcyjna.a = 6;
        klasaAbstrakcyjna.cos();
        klasaAbstrakcyjna.abstrakcyjna();
    }
}
