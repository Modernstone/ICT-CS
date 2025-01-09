// Employee.java
import java.util.*;
class Employee {
    private int id;
    private String name;
    private int seniority;
    private int[] performanceScores; // Last 5 years' scores
    private boolean departmentalExamPassed;
    private boolean hindiExamPassed;
    private boolean cccExamPassed;

    // Constructor
    public Employee(int id, String name, int seniority, int[] performanceScores, 
                    boolean departmentalExamPassed, boolean hindiExamPassed, boolean cccExamPassed) {
        this.id = id;
        this.name = name;
        this.seniority = seniority;
        this.performanceScores = performanceScores;
        this.departmentalExamPassed = departmentalExamPassed;
        this.hindiExamPassed = hindiExamPassed;
        this.cccExamPassed = cccExamPassed;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getSeniority() { return seniority; }
    public int[] getPerformanceScores() { return performanceScores; }
    public boolean isDepartmentalExamPassed() { return departmentalExamPassed; }
    public boolean isHindiExamPassed() { return hindiExamPassed; }
    public boolean isCccExamPassed() { return cccExamPassed; }

    // Helper Method
    public double getAveragePerformance() {
        int sum = 0;
        for (int score : performanceScores) {
            sum += score;
        }
        return performanceScores.length > 0 ? sum / (double) performanceScores.length : 0;
    }
}

// PromotionSystem.java


class PromotionSystem {
    private List<Employee> employees;

    // Constructor
    public PromotionSystem() {
        employees = new ArrayList<>();
    }

    // Add Employee
    public void addEmployee(Employee employee) {
        if (!employees.contains(employee)) {
            employees.add(employee);
        }
    }

    // Generate Eligible Employees List
    public List<Employee> getEligibleEmployees() {
        List<Employee> eligibleEmployees = new ArrayList<>();
        for (Employee emp : employees) {
            if (isEligible(emp)) {
                eligibleEmployees.add(emp);
            }
        }
        return eligibleEmployees;
    }

    // Eligibility Criteria
    private boolean isEligible(Employee emp) {
        return emp.getSeniority() >= 5 &&
               emp.getAveragePerformance() >= 60 &&
               emp.isDepartmentalExamPassed() &&
               emp.isHindiExamPassed() &&
               emp.isCccExamPassed();
    }

    // Display Eligible Employees
    public void displayEligibleEmployees() {
        List<Employee> eligible = getEligibleEmployees();
        if (eligible.isEmpty()) {
            System.out.println("No eligible employees found.");
        } else {
            System.out.println("Eligible Employees:");
            for (Employee emp : eligible) {
                System.out.println("ID: " + emp.getId() + ", Name: " + emp.getName());
            }
        }
    }
}

// Main.java

public class Main {
    public static void main(String[] args) {
        PromotionSystem system = new PromotionSystem();

        // Example Employee Data
        system.addEmployee(new Employee(1, "John Doe", 6, new int[]{70, 75, 80, 85, 90}, true, true, true));
        system.addEmployee(new Employee(2, "Jane Smith", 4, new int[]{60, 65, 70, 55, 60}, true, true, true));
        system.addEmployee(new Employee(3, "Sam Wilson", 7, new int[]{50, 55, 60, 65, 70}, false, true, true));

        // Display Eligible Employees
        system.displayEligibleEmployees();
    }
}



/*Overview
This code consists of three classes (Employee, PromotionSystem, and Main) that collectively implement a system to evaluate the eligibility of employees for promotion based on specific criteria.

1. Employee Class
This class models an employee with attributes and behaviors relevant to promotion eligibility.

Attributes:
id: Unique identifier for the employee.
name: Name of the employee.
seniority: Number of years the employee has worked.
performanceScores: An array representing the employee's performance scores over the last 5 years.
departmentalExamPassed, hindiExamPassed, cccExamPassed: Boolean flags indicating whether the employee has passed specific exams.
Constructor:
Initializes an employee with all attributes provided as arguments.

Methods:
Getters: Provide access to private attributes, such as getId(), getName(), etc.
getAveragePerformance(): Calculates and returns the average performance score of the employee.
2. PromotionSystem Class
This class manages a collection of employees and evaluates their eligibility for promotion.

Attributes:
employees: A List of Employee objects.
Methods:
addEmployee(Employee employee): Adds an employee to the list if they are not already present.
getEligibleEmployees(): Generates a list of employees who meet all the eligibility criteria.
isEligible(Employee emp): Evaluates if an employee satisfies the promotion criteria:
Has at least 5 years of seniority.
Has an average performance score of 60 or above.
Has passed all three exams (departmental, Hindi, and CCC).
displayEligibleEmployees(): Displays the IDs and names of all eligible employees. If none are eligible, it prints a corresponding message.
3. Main Class
This class contains the main method to demonstrate the functionality of the PromotionSystem.

Workflow:
Create PromotionSystem Object: Initializes an empty promotion system.
Add Employees:
Adds three example employees with varying attributes.
Display Eligible Employees:
Calls the displayEligibleEmployees method to display all employees who qualify for promotion based on the criteria.
Execution Flow
The program initializes a PromotionSystem object.
Three employees are added to the system:
John Doe: Seniority 6, average performance 80, passed all exams (eligible).
Jane Smith: Seniority 4, average performance 62, passed all exams (not eligible due to low seniority).
Sam Wilson: Seniority 7, average performance 60, failed departmental exam (not eligible due to failing one exam).
The system evaluates and prints the list of eligible employees:
Output: Only "John Doe" is eligible.
Key Concepts Illustrated
Encapsulation: The Employee class uses private fields and public getters to control access.
Collections Framework: The PromotionSystem uses ArrayList to manage employee data.
Logic Implementation: The isEligible method encapsulates the promotion criteria.
Polymorphism and Modularity: Separate classes (Employee, PromotionSystem) divide responsibilities. */