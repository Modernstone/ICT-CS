import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String id, name, className, semester, subject;
    int fee;

    Student(String id, String name, String className, String semester, String subject, int fee) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.semester = semester;
        this.subject = subject;
        this.fee = fee;
    }

    public String toString() {
        return id + " " + name + " " + className + " " + semester + " " + subject + " " + fee;
    }
}

public class StudentManagementSystem {

    static ArrayList<Student> students = new ArrayList<>();

    public static void recordStudentInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students to record: ");
        int n = sc.nextInt();
        sc.nextLine();  // Consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("ID: ");
            String id = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Class: ");
            String className = sc.nextLine();
            System.out.print("Semester: ");
            String semester = sc.nextLine();
            System.out.print("Subject: ");
            String subject = sc.nextLine();
            System.out.print("Fee: ");
            int fee = sc.nextInt();
            sc.nextLine();  // Consume newline

            students.add(new Student(id, name, className, semester, subject, fee));
        }
    }

    public static void displayStudentInfo() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void searchStudentByIdOrName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Search by:");
        System.out.println("1. ID");
        System.out.println("2. Name");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();  // Consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter ID to search: ");
                String id = sc.nextLine();
                for (Student student : students) {
                    if (student.id.equals(id)) {
                        System.out.println(student);
                        return;
                    }
                }
                System.out.println("Student not found.");
                break;

            case 2:
                System.out.print("Enter name to search: ");
                String name = sc.nextLine();
                for (Student student : students) {
                    if (student.name.equalsIgnoreCase(name)) {
                        System.out.println(student);
                    }
                }
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n Menu:");
            System.out.println("1. Record Student Information");
            System.out.println("2. Display Student Information");
            System.out.println("3. Search Information by ID or Name");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    recordStudentInfo();
                    break;
                case 2:
                    displayStudentInfo();
                    break;
                case 3:
                    searchStudentByIdOrName();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);
    }
}

/*
 Menu:
1. Record Student Information
2. Display Student Information
3. Search Information by ID or Name
4. Exit
Enter your choice: 1
Enter number of students to record: 2
Enter details for student 1:
ID: 21291371033
Name: vishva
Class: IT
Semester: 3
Subject: OOP
Fee: 200
Enter details for student 2:
ID: 21291371034
Name: Jayan
Class: IT
Semester: 3
Subject: OOP
Fee: 200

 Menu:
1. Record Student Information
2. Display Student Information
3. Search Information by ID or Name
4. Exit
Enter your choice: 2
21291371033 vishva IT 3 OOP 200
21291371034 Jayan IT 3 OOP 200

 Menu:
1. Record Student Information
2. Display Student Information
3. Search Information by ID or Name
4. Exit
Enter your choice: 3
Search by:
1. ID
2. Name
Enter choice: 1
Enter ID to search: 21291371033
21291371033 vishva IT 3 OOP 200

 Menu:
1. Record Student Information
2. Display Student Information
3. Search Information by ID or Name
4. Exit
Enter your choice: 4
Exiting...
*/