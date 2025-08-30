package Collections.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    static class NameComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.name.compareTo(e2.name); // alphabetical by name
        }
    }

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(2, "John"));
        list.add(new Employee(1, "Alice"));
        list.add(new Employee(3, "Bob"));

        Collections.sort(list, new NameComparator()); // custom comparator
        for (Employee e : list) {
            System.out.println(e.id + " " + e.name);
        }
    }
}
