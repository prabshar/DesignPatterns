package DesignPattern.SingletonPattern;

public class Patty {
    private static Patty patty;

    private Patty() {
    }

    public static Patty getPatty() {
        if (patty == null) {
            synchronized (Patty.class) {
                if (patty == null) {
                    patty = new Patty();
                }
            }
        }
        return patty;
    }
}
