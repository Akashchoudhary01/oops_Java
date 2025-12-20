package javaLab1;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value of n : ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.println("Fibonacci Series:");

        for(int i = 0; i < n; i++){
            System.out.println(a);   // print the current term
            int c = a + b;           // next term
            a = b;                   // move forward
            b = c;
        }
    }
}
