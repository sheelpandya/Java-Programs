import java.util.*;

record Employee(int id, String name, String designation, int salary, Date doj) {
}

public class EmployeeManagement {
    private List<Employee> employees;
    private Scanner sc = new Scanner(System.in);

    EmployeeManagement() {
        employees = new ArrayList<>();
    }

    public void addEmployee() {
        int id,salary;
        String name,designation;
        Date doj;
        System.out.println("Enter id (Number Format): ");
        id = sc.nextInt();

        //Checking for redundancy of id
        Iterator<Employee> itr = employees.iterator();
        while (itr.hasNext()) {
            Employee e = itr.next();
            System.out.println(e.id());
            if (e.id() == id) {
                System.out.println("Please Enter unique Id: ");
                return;
            }
        }

        System.out.println("Enter name: ");
        name = sc.next();

        System.out.println("Enter Salary: ");
        salary = sc.nextInt();

        System.out.println("Enter Designation: ");
        designation = sc.next();

        System.out.println("Enter Date of Joining (DD/MM/YY) format : ");
        doj = new Date(sc.next());

        Employee e = new Employee(id,name,designation,salary,doj);
        employees.add(e);

    }

    public void removeEmployee() {
        int id = sc.nextInt();
        Iterator<Employee> itr = employees.iterator();
        while (itr.hasNext()) {
            Employee e = itr.next();
            System.out.println(e.id());
            if (e.id() == id) {
                itr.remove();
            }
        }
    }

    public void ListEmployees() {
        Iterator<Employee> itr = employees.iterator();
        while (itr.hasNext()) {
            Employee e = itr.next();
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        int cnt = 1;
        EmployeeManagement em = new EmployeeManagement();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter what you want to perform: ");
            System.out.println("(1)-Add Employee: ");
            System.out.println("(2)-Remove Employee: ");
            System.out.println("(3)-List Employee: ");
            System.out.println("(4)-Menu: ");
            System.out.println("(5)-Exit: ");

            int ans = sc.nextInt();

            if(ans == 4){
                continue;
            }
            else if(ans==5){
                break;
            }

            switch (ans) {
                case 1 -> em.addEmployee();
                case 2 -> em.removeEmployee();
                case 3 -> em.ListEmployees();
            }

        }
        while (cnt != 0);

        System.out.println(em.employees);

    }
}
