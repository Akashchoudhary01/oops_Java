public class oopsFirst {
    public static class Student{
        // class
        String name ;
        int rollNumber;
        float percent;

    }
    public static void main(String[] args) {
        // object 
        Student akash = new Student();  //declearation
        //initialization
        akash.name = "Akash";
        akash.rollNumber = 42;
        akash.percent = 99.99f;

        System.out.println(akash.name);

        Student Rishu = new Student();
        Rishu.name = "hui";
        Rishu.rollNumber = 69;
        Rishu.percent = 69.69f;
        System.out.println(Rishu.percent);
        
    }
    
}
