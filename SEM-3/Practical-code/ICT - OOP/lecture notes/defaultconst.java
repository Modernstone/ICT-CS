class defaultconst {
    int x,y;

    defaultconst(){       //this is default constructor and the name is always similar as the class
        int x=10; 
        int y=20;
        System.err.println(x +" " + y);
    }
    public static void main(String[] args) {
        defaultconst obj = new defaultconst();
    }
}