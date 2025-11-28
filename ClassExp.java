

public class ClassExp {
    public static void main(String[] args) {
        Student Akash = new Student(); // the () is called a constructor its just a method
        Akash.name = "Akash Choudhary";
        System.out.println(Akash.name);

        
    }
    
}
class Student{
    int roll;
    String name;
    float marks;
}
