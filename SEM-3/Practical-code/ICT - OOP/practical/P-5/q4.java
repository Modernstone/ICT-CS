import java.util.Scanner;

public class SumFirstLastDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
            int num = scanner.nextInt();
            System.out.println(sumFirstLastDigits(num));
        }
        scanner.close();
    }
    
    public static int sumFirstLastDigits(int num) {
        int lastDigit = num % 10;
        while (num >= 10) {
            num /= 10;
        }
        int firstDigit = num;
        return firstDigit + lastDigit;
    }
}

/*
    3
    1234
    5
    23454
    6
    34334
    7
*/