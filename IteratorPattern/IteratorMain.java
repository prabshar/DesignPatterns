package DesignPattern.IteratorPattern;

import java.util.Map;

public class IteratorMain {

    public static void main(String[] args) {

        // Iterator Pattern via List
        UserService userService = new UserService();
        userService.users.add(new User(1, "User 1"));
        userService.users.add(new User(2, "User 2"));
        userService.users.add(new User(3, "User 3"));
        userService.users.add(new User(4, "User 4"));
        Iterator<User> iterator = userService.getIterator();
        while(iterator.hasNext()) {
            User user = iterator.next();
            System.out.println("User ID: " + user.getUserId() + ", User Name: " + user.getUserName());
        }

        // Iterator Pattern via Map
        EmployeeService employeeService = new EmployeeService();
        employeeService.employees.put(1, new Employee(1, "Employee 1"));    
        employeeService.employees.put(2, new Employee(2, "Employee 2"));
        employeeService.employees.put(3, new Employee(3, "Employee 3"));
        Iterator<Map.Entry<Integer, Employee>> employeeIterator = employeeService.getIterator();
        while(employeeIterator.hasNext()) {
            Map.Entry<Integer, Employee> entry = employeeIterator.next();
            Employee employee = entry.getValue();
            System.out.println("Employee ID: " + employee.getEmployeeId() + ", Employee Name: " + employee.getEmployeeName());
        }
    }
}
