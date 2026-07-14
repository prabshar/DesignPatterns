package DesignPattern.CompositePattern;

public class CompositeMain {

    public static void main(String[] args) {
        CompositeMain main = new CompositeMain();
        main.run();
    }

    public void run() {
        Family.Child cousin1 = new Family.Child("Prabhakar");
        Family.Child cousin2 = new Family.Child("Yugal");
        Family.Child cousin3 = new Family.Child("Rajan");
        Family.Child cousin4 = new Family.Child("Deepika");
        Family.Child cousin5 = new Family.Child("Bhaskar");

        Family.Father father = new Family.Father("Harish");
        father.addChild(cousin1);
        father.addChild(cousin2);
        father.addChild(cousin3);

        Family.Father uncle = new Family.Father("Anil");
        uncle.addChild(cousin4);
        uncle.addChild(cousin5);

        Family.Father grandFather = new Family.Father("Padma");
        grandFather.addChild(father);
        grandFather.addChild(uncle);

        grandFather.showHierarchy();
    }

}
