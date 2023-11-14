//package Oops;
import java.util.Scanner;

class Student {
    int roll;
    String name, address;
    double marks;

    public Student(int roll, String name, String address, double marks) {
        this.roll = roll;
        this.name = name;
        this.address = address;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Roll no is: " + roll);
        System.out.println("Name is: " + name);
        System.out.println("Address is: " + address);
        System.out.println("Marks: " + marks);
    }
}

public class Hlo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students details do you want? ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Roll: ");
            int roll = scanner.nextInt();
            scanner.nextLine(); // consume the newline character
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Marks: ");
            double marks = scanner.nextDouble();
            scanner.nextLine(); // consume the newline character

            students[i] = new Student(roll, name, address, marks);
        }

        System.out.println("\nDetails of all students:");
        for (Student student : students) {
            student.displayDetails();
            System.out.println("----------");
        }

        double totalMarks = 0;
        for (Student student : students) {
            totalMarks += student.marks;
        }

        double averageMarks = totalMarks / numStudents;
        System.out.println("\nAverage of all student marks is: " + averageMarks);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

