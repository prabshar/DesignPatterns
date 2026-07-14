package DesignPattern.SingletonPattern;

import java.io.Serializable;

public class Burger implements Serializable{
    private static Burger burger;

    private Burger() {
        if(burger != null) {
            throw new RuntimeException("Use getBurger() method to create");
        }
    }

    public static Burger getBurger() {
        if (burger == null) {
            synchronized (Burger.class) {
                if (burger == null) {
                    burger = new Burger();
                }
            }
        }
        return burger;
    }

    private Object readResolve() {
        return burger;
    }
}
