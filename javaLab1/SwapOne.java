import java.util.Scanner;


public class SwapOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter The  Value of a");
        int a = sc.nextInt();
        System.out.println("Enter The  Value of b");
        int b = sc.nextInt();

        System.out.println("The Value before swap are a = " + a +" b = "+b);
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("The Value after swap are a = " + a +" b = "+b);
      
    }
    
}
