// Java program to demonstrate the use of classes, objects, constructors, and methods
// to manage student information including names and roll numbers.
import java.util.Scanner;

class Student {
    private String name;
    private int rollNo;

    public Student() {
        // Empty constructor initializes empty values
    }

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }


    public String getName() {
        return name;
    }

    // Mutator methods
    public void setName(String newName) {
        name = newName;
    }

    // Accessor method for rollNo
    public int getRollNo() {
        return rollNo;
    }

    public static void main(String[] args) {
        Student[] students = new Student[3]; // Create an array to store 3 student objects

        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter student name: ");
                String name = sc.nextLine();

                System.out.print("Enter roll number: ");
                int rollNo = sc.nextInt();
                sc.nextLine(); // consume the leftover newline
                students[i] = new Student(name, rollNo);
            }

            // Display student names and roll numbers
            System.out.println("Student names and roll numbers:");
            for (Student student : students) {
                System.out.println("Name: " + student.getName() + ", Roll No: " + student.getRollNo());
            }

            System.out.println("Student names:");
            for (Student student : students) {
                System.out.println(student.getName());
            }
        }
    }
}