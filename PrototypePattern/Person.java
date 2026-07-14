package DesignPattern.PrototypePattern;

public class Person implements Cloneable{
    public String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    

}
