package DesignPattern.SingletonPattern;

import java.io.Serializable;

public class Bread implements Serializable{
    private static Bread bread;

    private Bread() {
        if(bread != null) {
            throw new RuntimeException("Use getBread() method to create");
        }
    }

    public static Bread getBread() {
        if (bread == null) {
            synchronized (Bread.class) {
                if (bread == null) {
                    bread = new Bread();
                }
            }
        }
        return bread;
    }
}
