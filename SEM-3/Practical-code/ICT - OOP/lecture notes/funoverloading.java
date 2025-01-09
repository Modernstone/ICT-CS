class department(){

    Static void info(){
        itn dep_id= 11;
        String dep_name = "ICT";
        String dep_add = "UVPC";
        int dep_cont = 0123456789;

        System.out.println("Department ID:" + dep_id );
        System.out.println("Department Name:" + dep_name );
        System.out.println("Department Address:"+ dep_add );
        System.out.println("Department Contact:" + dep_cont );
    }
}
class employee extends department(){

    Static void info(){
        itn emp_id= 01;
        String emp_name = "Vishva";
        String emp_add = "Mehsana";
        int emp_post = "senior developer";

        System.out.println("Employee ID:" + emp_id );
        System.out.println("Employee Name:" + emp_name );
        System.out.println("Employee Address:" + emp_add );
        System.out.println("Employee Post:" + emp_post );
    }
}

public static void main(System Args[]){
    employee obj = new employee();blazed.eh
    department.info();
    info();
}