/**
 * 5. WAP to perform the following operations on strings through interactive input. 
a) Sort given strings in alphabetical order. 
b) Check whether one string is sub string of another string or not. 
c) Convert the strings to uppercase.
 */
package javaLabExam;

import java.util.Scanner;
import java.util.Arrays;
public class StringOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        //Sort given strings in alphabetical order
        System.out.print("Enter The String  : ");
        String str = sc.nextLine();
        char [] arr = str.toCharArray();
        Arrays.sort(arr);
        String sorted = new String(arr);
        System.out.println(arr); 


        //Check whether one string is sub string of another string or not
        System.out.println("Substring Check");

        System.out.println("Inter The First String :");
        String str2 = sc.nextLine();

        System.out.println("Inter The Second String :");
        String str3 = sc.nextLine();

        if(str2.contains(str3)){
            System.out.println("Substring Found");
        }else{
            System.out.println("Substring not found");
        }

        //Convert the strings to uppercase.
        System.out.println("Convert the strings to uppercase.");
        System.out.println("Enter The String");
        String str4 = sc.nextLine();
        System.out.println(str4.toUpperCase());

    }
    
}
