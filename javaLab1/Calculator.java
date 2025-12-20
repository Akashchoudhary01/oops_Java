package javaLab1;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        while(true){
            System.out.println("--------------------------");
            System.out.println("------- Calculator -------");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");

            System.out.print("Enter Your Choice : ");
            int choice = sc.nextInt();

            if(choice == 0){
                System.out.println("Thanks For Using The Calculator :)");
                break;
            }

            System.out.print("Enter The Value of A : ");
            int A = sc.nextInt();
            System.out.print("Enter The Value of B : ");
            int B = sc.nextInt();

            switch (choice) {
                case 1: 
                    System.out.println("Sum : "+ (A + B));
                    break;
                case 2: 
                    System.out.println("Sub : "+ (A - B));
                    break;
                case 3: 
                    System.out.println("Mul : "+ (A * B));
                    break;
                case 4: 
                    if(B != 0)
                        System.out.println("Div : "+ (A / B));
                    else
                        System.out.println("Cannot divide by zero!");
                    break;      
                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
        }
    }
}
