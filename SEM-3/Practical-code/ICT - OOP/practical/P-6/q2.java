//Compiling Individually
// 1
import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is not a Prime number.");
        }

        sc.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}


/*
    Enter a number to check if it's prime: 33
    33 is not a Prime number.
 */

// 2
import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a five-digit number: ");
        int num = sc.nextInt();

        System.out.println("Sum of digits: " + sumOfDigits(num));

        sc.close();
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}


/*
Enter a five-digit number: 12345
Sum of digits: 15
 */

// 3
import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter time period in years: ");
        double time = sc.nextDouble();

        System.out.println("Simple Interest: " + simpleInterest(principal, rate, time));
        System.out.println("Compound Interest: " + compoundInterest(principal, rate, time));

        sc.close();
    }

    public static double simpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static double compoundInterest(double principal, double rate, double time) {
        return principal * Math.pow((1 + rate / 100), time) - principal;
    }
}


/*
Enter principal amount: 200000
Enter rate of interest: 5
Enter time period in years: 2
Simple Interest: 20000.0
Compound Interest: 20500.0
*/

// 4
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int num = sc.nextInt();

        System.out.println("Reversed number: " + reverse(num));

        sc.close();
    }

    public static int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }
}

/*
Enter a number to reverse: 3467
Reversed number: 7643
*/

// 5
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Before swap: a = " + a + ", b = " + b);
        swap(a, b);

        sc.close();
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}


/*
Enter first number: 22
Enter second number: 33
Before swap: a = 22, b = 33
After swap: a = 33, b = 22
 */

// Switch Case
import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Find Prime Number");
            System.out.println("2. Find Digit Sum of a Five-Digit Number");
            System.out.println("3. Find Simple and Compound Interest");
            System.out.println("4. Reverse a Number");
            System.out.println("5. Swap Two Numbers");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to check if it's prime: ");
                    int num1 = sc.nextInt();
                    if (isPrime(num1)) {
                        System.out.println(num1 + " is a Prime number.");
                    } else {
                        System.out.println(num1 + " is not a Prime number.");
                    }
                    break;

                case 2:
                    System.out.print("Enter a five-digit number: ");
                    int num2 = sc.nextInt();
                    System.out.println("Sum of digits: " + sumOfDigits(num2));
                    break;

                case 3:
                    System.out.print("Enter principal amount: ");
                    double principal = sc.nextDouble();
                    System.out.print("Enter rate of interest: ");
                    double rate = sc.nextDouble();
                    System.out.print("Enter time period in years: ");
                    double time = sc.nextDouble();
                    System.out.println("Simple Interest: " + simpleInterest(principal, rate, time));
                    System.out.println("Compound Interest: " + compoundInterest(principal, rate, time));
                    break;

                case 4:
                    System.out.print("Enter a number to reverse: ");
                    int num3 = sc.nextInt();
                    System.out.println("Reversed number: " + reverseNumber(num3));
                    break;

                case 5:
                    System.out.print("Enter first number: ");
                    int a = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int b = sc.nextInt();
                    swapNumbers(a, b);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 6);

        sc.close();
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Function to find sum of digits of a number
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Function to calculate simple interest
    public static double simpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    // Function to calculate compound interest
    public static double compoundInterest(double principal, double rate, double time) {
        return principal * Math.pow((1 + rate / 100), time) - principal;
    }

    // Function to reverse a number
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }

    // Function to swap two numbers
    public static void swapNumbers(int a, int b) {
        System.out.println("Before swap: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}


/*
 Menu:
1. Find Prime Number
2. Find Digit Sum of a Five-Digit Number
3. Find Simple and Compound Interest
4. Reverse a Number
5. Swap Two Numbers
6. Exit
Enter your choice: 1
Enter a number to check if it's prime: 2
2 is a Prime number.

 Menu:
1. Find Prime Number
2. Find Digit Sum of a Five-Digit Number
3. Find Simple and Compound Interest
4. Reverse a Number
5. Swap Two Numbers
6. Exit
Enter your choice: 2
Enter a five-digit number: 12643
Sum of digits: 16

 Menu:
1. Find Prime Number
2. Find Digit Sum of a Five-Digit Number
3. Find Simple and Compound Interest
4. Reverse a Number
5. Swap Two Numbers
6. Exit
Enter your choice: 3
Enter principal amount: 34
Enter rate of interest: 1
Enter time period in years: 2
Simple Interest: 0.68
Compound Interest: 0.6833999999999989

 Menu:
1. Find Prime Number
2. Find Digit Sum of a Five-Digit Number
3. Find Simple and Compound Interest
4. Reverse a Number
5. Swap Two Numbers
6. Exit
Enter your choice: 4
Enter a number to reverse: 345
Reversed number: 543

 Menu:
1. Find Prime Number
2. Find Digit Sum of a Five-Digit Number
3. Find Simple and Compound Interest
4. Reverse a Number
5. Swap Two Numbers
6. Exit
Enter your choice: 5
Enter first number: 22 33
Enter second number: Before swap: a = 22, b = 33
After swap: a = 33, b = 22

 Menu:
1. Find Prime Number
2. Find Digit Sum of a Five-Digit Number
3. Find Simple and Compound Interest
4. Reverse a Number
5. Swap Two Numbers
6. Exit
Enter your choice: 6
Exiting...
 */