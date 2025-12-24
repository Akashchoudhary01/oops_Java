// package javaLabExam;

import java.util.Scanner;

class Employee{
    int empId;
    String empName;
    double salary;
    double tax;

    void input(){
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter The Employee ID : ");
        empId = sc.nextInt();

        System.out.println("Enter The Employee Name : ");
        empName = sc.next();
        sc.nextLine();

        System.out.println("Enter The Employee Salary : ");
        salary = sc.nextDouble();
    }
   void calculateTax() {
    if (salary <= 250000) {
        tax = 0;
    } 
    else if (salary <= 500000) {
        tax = (salary - 250000) * 0.05;
    } 
    else if (salary <= 1000000) {
        tax = (250000 * 0.05)
            + (salary - 500000) * 0.20;
    } 
    else {
        tax = (250000 * 0.05)
            + (500000 * 0.20)
            + (salary - 1000000) * 0.30;
    }
}


    void display(){
        System.out.println("Employee id : " +empId);
        System.out.println("Employee Name : " +empName);
        System.out.println("Employee Salary : " + salary);
        System.out.println("Employee tax Amount " + tax);
    }
}
public class Second {
    public static void main(String[] args) {
        Employee akash = new Employee();
        akash.input();
        akash.calculateTax();
        akash.display();
    }

    
}
