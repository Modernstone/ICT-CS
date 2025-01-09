class copycons{
    int x, y;

    copycons(int a, int b) {
        x = a;
        y = b;
        System.out.println(a+b);
    }

    public static void main(String[] args) {
         copycons obj = new copycons(10,20);
         copycons obj1 = obj;
    }
}
