package DesignPattern.IteratorPattern;

import java.util.HashMap;
import java.util.Map;

public class EmployeeService {
    Map<Integer, Employee> employees = new HashMap<>();

    public Iterator<Map.Entry<Integer, Employee>> getIterator() {
        return new MapIterator<Integer, Employee>(employees);
    }
}
