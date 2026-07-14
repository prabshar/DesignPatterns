package DesignPattern.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    List<User> users = new ArrayList<>();

    public Iterator<User> getIterator() {
        return new ListIterator<>(users);
    }
}
