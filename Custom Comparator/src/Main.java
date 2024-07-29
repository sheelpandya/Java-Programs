import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    record Employee(String name,String role){};

    public static void main(String[] args) {
       List<Employee> l = new ArrayList<Employee>();

       Employee e1= new Employee("sheel","TechMaster");
       Employee e2= new Employee("virat","WebMaster");
       Employee e3= new Employee("abd","MLMaster");
       Employee e4= new Employee("sheel","JavaMaster");
        l.add(e1);
        l.add(e2);
        l.add(e3);
        l.add(e4);
       var customComparator = Comparator.comparing(Employee::name).thenComparing(Employee::role);

        System.out.println(l);
        Collections.sort(l,customComparator);

        System.out.println(l);

    }
}