//InheritanceExample

package garbage;
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);  // Call the superclass constructor
        this.studentId = studentId;
    }

    public void displayStudentInfo() {
        displayInfo();  // Access the superclass method
        System.out.println("Student ID: " + studentId);
    }
}

public class g2 {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20, "S12345");

        // Access methods from the superclass
        student.displayInfo();

        // Access methods from the subclass
        student.displayStudentInfo();
    }
}

