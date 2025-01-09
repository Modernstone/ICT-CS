class parameterconst {
    int x, y;
    int sum, mul, div, sub;

    parameterconst(int a, int b) {
        x = a;
        y = b;
        sum = x + y;
        mul = x * y;
        div = x / y;
        sub = x - y;

        System.out.println("Sum of two numbers           : " + sum);
        System.out.println("Multiplication of two numbers: " + mul);
        System.out.println("Division of two numbers      : " + div);
        System.out.println("Subtraction of two numbers   : " + sub);
    }

    public static void main(String[] args) {
        parameterconst obj = new parameterconst(20, 10); 
    }
}
