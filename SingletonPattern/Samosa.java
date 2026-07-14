package DesignPattern.SingletonPattern;

public class Samosa {
    public static Samosa samosa;

    private Samosa() {
    }

    public static Samosa getSamosa() {
        if (samosa == null) {
            samosa = new Samosa();
        }
        return samosa;
    }
}
