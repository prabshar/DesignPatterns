package DesignPattern.SingletonPattern;

public class Lassi {
    public static Lassi lassi;

    private Lassi() {
    }

    public static Lassi getLassi() {
        if (lassi == null) {
            synchronized (Lassi.class) {
                if (lassi == null) {
                    lassi = new Lassi();
                }
            }
        }
        return lassi;
    }

}
