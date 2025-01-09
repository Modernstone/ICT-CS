class operations {
    public int operation(int a, int b) {
        return a + b;
    }

    public double operation(int a, double b) {
        return a - b;
    }

    public double operation(double a, double b) {
        return a * b;
    }

    public int operation(char a, char b) {
        return a + b; 
    }

    public String operation(String a, String b) {
        return a + b; 
    }
}

public class Main {
    public static void main(String[] args) {
        operations op = new operations();
        
        System.out.println("Addition of two integers: " + op.operation(5, 10));             
        System.out.println("Subtraction of int and double: " + op.operation(20, 5.5));
        System.out.println("Multiplication of two doubles: " + op.operation(2.5, 4.2));
        System.out.println("Addition of two characters: " + op.operation('A', 'B'));
        System.out.println("Addition of two strings: " + op.operation("Hello", " World"));
    }
}