import java.util.Scanner;

class Student2 {
    public static void main(String[] args) {
        int num, rem, product = 1;
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        // Calculate product of digits
        rem = num % 10;
        product = product * rem;
        num = num / 10;

        rem = num % 10;
        product = product * rem;
        num = num / 10;

        rem = num % 10;
        product = product * rem;
        num = num / 10;

        rem = num % 10;
        product = product * rem;
        num = num / 10;

        rem = num % 10;
        product = product * rem;
        num = num / 10;

        System.out.println("The product of the digits is: " + product);
    }
}
