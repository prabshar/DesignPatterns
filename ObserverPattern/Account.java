package DesignPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Account {
    public String name;
    public List<String> reeList = new ArrayList<>();
    List<Follower> followers = new ArrayList<>();

    public Account(String name) {
        this.name = name;
    }

    public void follow(Follower follower) {
        followers.add(follower);
        System.out.println(follower.name + " is now following " + name);
    }

    public void unfollow(Follower follower) {
        followers.remove(follower);
        System.out.println(follower.name + " has unfollowed " + name);
    }

    public void uploadReel(String reel) {
        reeList.add(reel);
        System.out.println(name + " has uploaded a new reel: " + reel);
        notifyFollowers(reel);
    }

    public void notifyFollowers(String reel) {
        for (Follower follower : followers) {
            follower.update(reel);
        }
    }
}
