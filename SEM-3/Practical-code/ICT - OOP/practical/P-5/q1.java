import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {
        System.out.print("Enter Number of test case:");
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();  // Number of test cases
        
        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            
            if (A > B) {
                System.out.println(">");
            } else if (A < B) {
                System.out.println("<");
            } else {
                System.out.println("=");
            }
        }
        scanner.close();
    }
}

/* 
    Enter Number of test case: 33
    1 2
    <
    22 33
    <
    22 22
    =
*/