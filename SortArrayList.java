import java.util.ArrayList;
import java.util.Collections;

// Employee class implementing Comparable
class Employee implements Comparable<Employee> {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }
}

public class SortArrayList {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Alice", 55000));
        list.add(new Employee(102, "Bob", 45000));
        list.add(new Employee(103, "Charlie", 65000));
        list.add(new Employee(104, "David", 50000));

        System.out.println("Before Sorting:");
        for (Employee e : list) {
            System.out.println(e);
        }

        // Sort using Comparable
        Collections.sort(list);

        System.out.println("\nAfter Sorting (by Salary):");
        for (Employee e : list) {
            System.out.println(e);
        }
    }
}
