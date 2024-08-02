package comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StudentDemo {
    public static void main(String[] args) {
        // Create an ArrayList to hold Student objects
        ArrayList<Student> studentList = new ArrayList<>();

        // Add new Student records to the ArrayList
        studentList.add(new Student(1, "John Doe", 15, "10th"));
        studentList.add(new Student(1, "John Doe", 14, "10th"));
        studentList.add(new Student(1, "John Doe", 17, "10th"));
        studentList.add(new Student(3, "Emily Johnson", 14, "9th"));
        studentList.add(new Student(5, "Sarah Davis", 15, "10th"));
        studentList.add(new Student(4, "Michael Brown", 17, "12th"));
        studentList.add(new Student(2, "Jane Smith", 16, "11th"));

        var rollComparator = Comparator.comparing(Student::getRollNum).thenComparing(Student::getAge);
        Collections.sort(studentList,rollComparator);

        System.out.p











































































































    ArrayList<Integer> a= new ArrayList<>(5);
    a.get(12);

        System.out.println("\nUpdated Student List:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}

class Student {
    private int rollNum;
    private String name;
    private int age;
    private String grade;

    // Constructor
    public Student(int rollNum, String name, int age, String grade) {
        this.rollNum = rollNum;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getter and Setter for rollNum
    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter for grade
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // Method to update the grade
    public void updateGrade(String newGrade) {
        this.grade = newGrade;
    }

    // Method to increment the age
    public void birthday() {
        this.age += 1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNum=" + rollNum +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                '}';
    }
}
