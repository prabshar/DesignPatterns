package DesignPattern.PrototypePattern;

public class PrototypeMain {
    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = null;
        try {
            person2 = (Person) person1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        person1.name = "Mike";
        
        System.out.println("Person 1: " + person1.name);
        System.out.println("Person 2: " + person2.name);
    }
}
