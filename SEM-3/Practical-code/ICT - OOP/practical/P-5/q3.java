import java.util.Scanner;

public class NumberPropertiesCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a three-digit number: ");
        int num = scanner.nextInt();
        
        System.out.println("Is Armstrong: " + isArmstrong(num));
        System.out.println("Is Palindrome: " + isPalindrome(num));
        System.out.println("Is Perfect: " + isPerfect(num));
        
        scanner.close();
    }
    
    // Check if Armstrong number
    public static boolean isArmstrong(int num) {
        int original = num, sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }
        return sum == original;
    }
    
    // Check if Palindrome
    public static boolean isPalindrome(int num) {
        int original = num, reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed == original;
    }
    
    // Check if Perfect number
    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}

/*
    Enter a three-digit number: 324
    Is Armstrong: false
    Is Palindrome: false
    Is Perfect: false
*/