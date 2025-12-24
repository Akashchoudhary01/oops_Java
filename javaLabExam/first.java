// package javaLabExam;

import java.util.Scanner;

class Student {
    int rollNumber;
    String name ;
    int marks1 , marks2 , marks3;
    int total;
    float percentage;

    //Member Functions input
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Roll Number : ");
        rollNumber = sc.nextInt();
        System.out.print("Enter The Name : ");
        name = sc.next();
        name = sc.nextLine();
        System.out.print("Enter The marks1 : ");
        marks1 = sc.nextInt();
        System.out.print("Enter The Marks 2 : ");
        marks2 = sc.nextInt();
        System.out.print("Enter The Marks 3 : ");
        marks3 = sc.nextInt();
    }
    void calculate(){
        total = marks1 + marks2 + marks3;
        percentage = (total/3.0f);
    }
    void display(){
        System.out.println("  \n -----Student Result-----");
        System.out.println("Roll Number : "+ rollNumber);
        System.out.println("Name : "+ name);
        System.out.println("Marks 1 : "+ marks1);
        System.out.println("Marks 2 : "+ marks2);
        System.out.println("Marks 3 : "+ marks3);
        System.out.println("Total Marks : " + total);
        System.out.println("Percentagem : " + Math.round(percentage));
    }

}

public class first {
    public static void main(String[] args) {
        Student akash = new Student();
        akash.input();
        akash.calculate();
        akash.display();

    }
    
}
