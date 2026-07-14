package DesignPattern.ObserverPattern;

public class ObserverMain {
    public static void main(String[] args) {
        Account account = new Account("Arijit Singh");
        Follower follower1 = new Follower("Follower 1");
        Follower follower2 = new Follower("Follower 2");

        System.out.println("Day 1");
        account.follow(follower1);
        account.follow(follower2);

        System.out.println("Day 2");
        account.uploadReel("New Reel 1");
        account.uploadReel("New Reel 2");

        System.out.println("Day 3");
        account.unfollow(follower1);

        System.out.println("Day 4");
        account.uploadReel("New Reel 3");

    }

}
