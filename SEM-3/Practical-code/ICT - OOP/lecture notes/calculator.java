import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        int x, y, sum, sub, mul;
        double div;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers:");
        x = sc.nextInt();
        y = sc.nextInt();

        sum = x + y;
        sub = x - y;
        mul = x * y;
        div = (double) x / y;

        System.out.println("Addition of both numbers: " + sum);
        System.out.println("Subtraction of both numbers: " + sub);
        System.out.println("Multiplication of both numbers: " + mul);
        System.out.println("Division of both numbers: " + div);
    }
}
