import java.util.Scanner;

public class searchdelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        // Input 10 numbers
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }

        // Search an element
        System.out.print("Enter number to search: ");
        int searchElement = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < 10; i++) {
            if (num[i] == searchElement) {
                found = true;
                System.out.println("Number found at index: " + i);
                break;
            }
        }
        if (!found) {
            System.out.println("Number not found.");
        }

        // Delete an element
        System.out.print("Enter number to delete: ");
        int deleteElement = sc.nextInt();
        found = false;
        for (int i = 0; i < 10; i++) {
            if (num[i] == deleteElement) {
                num[i] = 0; // Setting the value to 0 as a deletion
                found = true;
                System.out.println("Number deleted.");
                break;
            }
        }
        if (!found) {
            System.out.println("Number not found.");
        }
    }
}
