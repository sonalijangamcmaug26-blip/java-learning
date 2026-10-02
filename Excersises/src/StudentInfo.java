 class Student {
    public String name;
    public int roll_no;
    public String phone_no;
    public String address;


    
}

public class StudentInfo{
    public static void main(String[] args){
        Student obj = new Student();
        obj.name = " john";
        obj.roll_no = 2;
        obj.phone_no = " 9097647 ";
        obj.address = "vasangt vihar ";
        System.out.println(obj.name + obj.roll_no + obj.phone_no + obj.address);

        Student obj2 = new Student();
        obj2.name = "Sam";
        obj2.roll_no = 3;
        obj2.phone_no = "9898790";
        obj2.address = "thane pawar nagar ";
        System.out.println(obj2.name + obj2.roll_no + obj2.phone_no + obj2.address);

        


       
    }
    
}
