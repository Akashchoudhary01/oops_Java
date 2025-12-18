public class oopsFirst {
    public static class Student{
        // class
        String name ;
        int rollNumber;
        float percent;

    }
    public static void main(String[] args) {
        // object 
        Student akash = new Student();
        akash.name = "Akash";
        akash.rollNumber = 42;
        akash.percent = 99.99f;

        System.out.println(akash.name);
        
    }
    
}
