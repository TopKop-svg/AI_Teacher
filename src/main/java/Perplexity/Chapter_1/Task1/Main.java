package Perplexity.Chapter_1.Task1;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Employee> set = new HashSet<>();
        set.add(new Employee(1, "Maria", "HR"));
        set.add(new Employee(2, "Maxim", "Develp"));
        set.add(new Employee(2, "Alex", "Frontend"));
        set.add(new Employee(2, "Grisha", "Tests"));
        set.add(new Employee(2, "Ruslan", "Develp"));
        set.add(new Employee(2, "Alex", "Frontend"));

        for(Employee employee : set) {
            System.out.println(employee);
        }
    }
}
