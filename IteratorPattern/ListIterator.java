package DesignPattern.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class ListIterator<T> implements Iterator<T> {

    List<T> list = new ArrayList<>();
    int index = 0;

    public ListIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public T next() {
        return list.get(index++);
    }
    
}
