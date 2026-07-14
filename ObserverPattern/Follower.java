package DesignPattern.ObserverPattern;

public class Follower {
    public String name;
    public Follower(String name) {
        this.name = name;
    }

    public void update(String reel) {
        System.out.println(name + " has been notified about " + reel);
    }
}
