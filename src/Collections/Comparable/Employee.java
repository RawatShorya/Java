package Collections.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {
    private char id;
    private String name;

    Employee(char id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }



    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee('c', "John3"));
        list.add(new Employee('a', "John1"));
        list.add(new Employee('b', "John2"));
        Collections.sort(list);
        for (Employee e : list) {
            System.out.println(e.id + " " + e.name);
        }

    }
}
