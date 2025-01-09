import java.util.Scanner;

// Base class
class Person {
    // Protected
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display basic person info
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Derived class Student that inherits from Person
class Student extends Person {
    // Private fields for Student class
    private String studentId;
    private String Course;

    // Constructor for Student class
    public Student(String name, int age, String studentId, String Course) {
        super(name, age); // Call to the base class constructor
        this.studentId = studentId;
        this.Course = Course;
    }

    // Public methods to access private fields (getters)
    public String getStudentId() {
        return studentId;
    }

    public String getCourse() {
        return Course;
    }

    //Display student-specific info
    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId + ", Course: " + Course);
        displayInfo(); // Call the base class method to display person info
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for five students from the user
        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Student ID: ");
            String studentId = scanner.nextLine();
            System.out.print("Course: ");
            String Course = scanner.nextLine();

            // Assign input data to student objects
            students[i] = new Student(name, age, studentId, Course);
        }

        // Loop to display options for user and take action based on choice
        boolean exit = false;
        while (!exit) {
            System.out.println("\nHow would you like to display student information?");
            System.out.println("1. Display by Name");
            System.out.println("2. Display by Student ID (Roll Number)");
            System.out.println("3. Display by Course");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    // Display by name
                    System.out.print("Enter a name to search for: ");
                    String searchName = scanner.nextLine();
                    boolean foundName = false;
                    for (Student student : students) {
                        if (student.name.equalsIgnoreCase(searchName)) {
                            System.out.println("Record found:");
                            student.displayStudentInfo();
                            foundName = true;
                        }
                    }
                    if (!foundName) {
                        System.out.println("No student found with the name: " + searchName);
                    }
                    break;

                case 2:
                    // Display by Student ID (Roll Number)
                    System.out.print("Enter a Student ID to search for: ");
                    String searchId = scanner.nextLine();
                    boolean foundId = false;
                    for (Student student : students) {
                        if (student.getStudentId().equals(searchId)) {
                            System.out.println("Record found:");
                            student.displayStudentInfo();
                            foundId = true;
                        }
                    }
                    if (!foundId) {
                        System.out.println("No student found with the Student ID: " + searchId);
                    }
                    break;

                case 3:
                    // Display by Course
                    System.out.print("Enter a Course to search for: ");
                    String searchCourse = scanner.nextLine();
                    boolean foundCourse = false;
                    for (Student student : students) {
                        if (student.getCourse().equalsIgnoreCase(searchCourse)) {
                            System.out.println("Record found:");
                            student.displayStudentInfo();
                            foundCourse = true;
                        }
                    }
                    if (!foundCourse) {
                        System.out.println("No student found with the Course: " + searchCourse);
                    }
                    break;

                case 4:
                    // Display all students
                    System.out.println("Displaying all student records:");
                    for (Student student : students) {
                        student.displayStudentInfo();
                        System.out.println("-------------------------");
                    }
                    break;

                case 5:
                    // Exit the program
                    exit = true;
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option (1-5).");
                    break;
            }
        }

        scanner.close();
    }
}
