package pl.edu.wszib.abstrakcja;

public class App {
    public static void main(String[] args) {
        JakisInterface obiektKolegi = new KlasaDlaKolegi();
        obiektKolegi.zrobCos();
        obiektKolegi.jakasMetroda1(5);
        int z = obiektKolegi.jakasInnaMetoda(7, "cos");
    }
}
