import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int evencnt = 0;
        int oddcnt = 0;

        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Even numbers: ");
        for (int i = 0; i < 10; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
                evencnt++;
            }
        }

        System.out.print("Odd numbers: ");
        for (int i = 0; i < 10; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
                oddcnt++;
            }
        }
        System.out.println("\nTotal count of even numbers: " + evencnt);
        System.out.println("Total count of odd numbers: " + oddcnt);
    }
}
