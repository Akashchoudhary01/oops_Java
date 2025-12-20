// package javaLab1;

import java.util.Scanner;

public class HarmonicSum {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter The Value of n: ");
        int n = sc.nextInt();
        double sum = 0.0;

        for(int i = 1; i<=n; i++){
            System.out.print("1/" + i);
            if(i < n) System.out.print(" + ");
            sum += 1.0 / i;

        }
        System.out.println("\n \n Sum of Harmonic Series is " + sum);
    }
    
}
