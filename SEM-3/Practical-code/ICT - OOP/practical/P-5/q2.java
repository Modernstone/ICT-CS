public class SeriesGeneration {
    public static void main(String[] args) {
        generateNaturalNumbers(10);
        generateMultiplicationTable(5, 10);
        generateCustomSeries(6, 5, 10);
        generateFibonacciSeries(10);
    }
    
    // 1. Natural Number Series
    public static void generateNaturalNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    // 2. Multiplication Table
    public static void generateMultiplicationTable(int num, int length) {
        for (int i = 1; i <= length; i++) {
            System.out.print(num * i + " ");
        }
        System.out.println();
    }
    
    // 3. Custom Series
    public static void generateCustomSeries(int start, int step, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(start + (step * i) + " ");
        }
        System.out.println();
    }
    
    // 4. Fibonacci Series
    public static void generateFibonacciSeries(int length) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < length; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
    }
}

/* 
    1 2 3 4 5 6 7 8 9 10 
    5 10 15 20 25 30 35 40 45 50 
    6 11 16 21 26 31 36 41 46 51 
    0 1 1 2 3 5 8 13 21 34 
*/