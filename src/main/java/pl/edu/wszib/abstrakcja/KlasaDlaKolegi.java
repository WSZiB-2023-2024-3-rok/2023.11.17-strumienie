package pl.edu.wszib.abstrakcja;

public class KlasaDlaKolegi implements JakisInterface {
    @Override
    public void jakasMetroda1(int x) {
        System.out.println("Jakas metoda : " + x);
    }

    @Override
    public int jakasInnaMetoda(int x, String s) {
        System.out.println("Jakas inna metoda x: " + x + ", s: " + s);
        return x*5;
    }

    @Override
    public void zrobCos() {
        System.out.println("zrob cos !!!");
    }
}
