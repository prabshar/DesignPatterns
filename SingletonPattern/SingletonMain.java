package DesignPattern.SingletonPattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class SingletonMain {
    public static void main(String[] args) throws IOException {
        //Eager Initialization
        System.out.println(Jalebi.getJalebi().hashCode());
        System.out.println(Jalebi.getJalebi().hashCode());

        //Lazy Initialization
        System.out.println(Samosa.getSamosa().hashCode());
        System.out.println(Samosa.getSamosa().hashCode());

        //Multithreaded Lazy Initialization
        System.out.println(Lassi.getLassi().hashCode());
        System.out.println(Lassi.getLassi().hashCode());

        //Break Singleton Pattern using Reflection
        try{
            System.out.println(Patty.getPatty().hashCode());
            Constructor<Patty> constructor = Patty.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            System.out.println(constructor.newInstance().hashCode());
        }catch (Exception e) {
            e.printStackTrace();
        }

        //Handling Singleton Pattern using constructor exception
        try{
            System.out.println(Cake.getCake().hashCode());
            Constructor<Cake> constructor = Cake.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            System.out.println(constructor.newInstance().hashCode());
        }catch (Exception e) {
            System.err.println(e);
        }

        //Handling Singleton Pattern using Enum
        System.out.println(Pizza.INSTANCE.hashCode());
        System.out.println(Pizza.INSTANCE.hashCode());

        //Breaking Singleton Pattern using Serialization
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try{
            System.out.println(Burger.getBurger().hashCode());
            oos = new ObjectOutputStream(new FileOutputStream("test"));
            oos.writeObject(Burger.getBurger());
            ois = new ObjectInputStream(new FileInputStream("test"));
            System.out.println(((Burger)ois.readObject()).hashCode());
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            new java.io.File("test").delete();
            if (oos != null) {
                oos.close();
            }
            if (ois != null) {
                ois.close();
            }
        }

    }
}
