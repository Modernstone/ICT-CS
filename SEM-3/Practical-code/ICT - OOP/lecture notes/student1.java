class student1 {
    public static void main(String args[]) {
        Department dept = new Department();
        dept.getInfo();
    }
}

class Department {
    int id;
    String name;

    public void getInfo() {
        id = 1;
        name = "Vishva";
        System.out.println(id + " " + name);
    }
}
