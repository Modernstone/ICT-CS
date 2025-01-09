import java.util.Scanner;

public class sumandavg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;

        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        double avg = sum / 10.0;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}
