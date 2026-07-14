package DesignPattern.SingletonPattern;

public class Cake {
    private static Cake cake;

    private Cake() {
        if(cake != null) {
            throw new RuntimeException("Use getCake() method to create");
        }
    }

    public static Cake getCake() {
        if (cake == null) {
            synchronized (Cake.class) {
                if (cake == null) {
                    cake = new Cake();
                }
            }
        }
        return cake;
    }
}
