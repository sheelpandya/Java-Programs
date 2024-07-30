import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {


    record Employee(String name, String role) {
    };


    public static void main(String[] args) {
        List<Employee> l = new ArrayList<Employee>();

        Employee e1 = new Employee("sheel", "TechMaster");
        Employee e2 = new Employee("virat", "WebMaster");
        Employee e3 = new Employee("abd", "MLMaster");
        Employee e4 = new Employee("sheel", "JavaMaster");
        Employee e5 = new Employee("sheel", "JavaMaster");
        l.add(e1);
        l.add(e2);
        l.add(e3);
        l.add(e4);
        l.add(e5);
// To sort in ascending order where name is first priority and role is second priority
        var customComparator = Comparator.comparing(Employee::name).thenComparing(Employee::role);

        //To sort by reverse just add reverse() at the end
//       var customComparator = Comparator.comparing(Employee::name).reversed().thenComparing(Employee::role);

        System.out.println(l);
        Collections.sort(l, customComparator);

        System.out.println(l);

    }
}