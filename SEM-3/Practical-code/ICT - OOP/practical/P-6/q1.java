import java.util.Scanner;

public class EvenOddCount {

    // Method without parameters
    public static void countEvenOddWithoutParams() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int evenCount = 0, oddCount = 0;

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }

    // Method with parameters
    public static void countEvenOddWithParams(int[] numbers) {
        int evenCount = 0, oddCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }

    public static void main(String[] args) {
        // Using the method without parameters
        System.out.println("Counting Even and Odd numbers without parameters:");
        countEvenOddWithoutParams();

        // Using the method with parameters
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers for the parameterized method:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Counting Even and Odd numbers with parameters:");
        countEvenOddWithParams(numbers);

        scanner.close();
    }
}

/*
    Counting Even and Odd numbers without parameters:
    Enter 10 numbers:
    1 2 3 4 5 6 7 8 9 10
    Even count: 5
    Odd count: 5
    Enter 10 numbers for the parameterized method:
    2 3 4 5 6 7 8 9 10 11
    Counting Even and Odd numbers with parameters:
    Even count: 5
    Odd count: 5
 */