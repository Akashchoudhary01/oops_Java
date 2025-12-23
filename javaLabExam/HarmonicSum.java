//4. WAP to determine the sum of the following harmonic series for a given value of ‗n‘.  1+1/2+1/3+. . . _1/n 
package javaLabExam;

import java.util.Scanner;

public class HarmonicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value of N : ");
        int n = sc.nextInt();

        double sum = 0.0;

        for(int i = 1; i<=n ; i++){
            System.out.print("1/"+i);
            if( i <n ) System.out.print(" + ");
            sum += 1.0/i;
        }
        System.out.println("\n\n" + sum);
    }
    
}
