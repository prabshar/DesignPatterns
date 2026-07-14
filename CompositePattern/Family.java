package DesignPattern.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public interface Family {
    public interface Member {
        public void showHierarchy(int depth);

        default public void showHierarchy() {
            showHierarchy(0);
        }
    }

    public class Father implements Member {

        public String name;

        public Father(String name) {
            this.name = name;
        }

        List<Member> children = new ArrayList<Family.Member>();

        public void addChild(Member child) {
            children.add(child);
        }

        @Override
        public void showHierarchy(int depth) {
            System.out.println("\t".repeat(depth) + name);
            for (Member child : children) {
                child.showHierarchy(depth + 1);
            }
        }

    }

    public class Child implements Member {

        public String name;

        public Child(String name) {
            this.name = name;
        }

        @Override
        public void showHierarchy(int depth) {
            System.out.println("\t".repeat(depth) + name);
        }
        
    }
}
