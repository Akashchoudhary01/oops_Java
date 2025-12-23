//Write a Java program to demonstrate method overloading by calculating area/peremeter of different shapes(square , rectangle etc.)
package javaLabExam;


class AreaCalCulator{
    
    //Area of a Square 
    double area(double side){
        return side * side;
    }
    double area(double l , double b ){
        return l*b;
    }
    double Parameter(double area){
        return 4 * area;
    }
    double Parameter(double l , double b){
        return 2*(l+b);
    }

}
public class Area {
    public static void main (String [] args){

        AreaCalCulator AP = new AreaCalCulator();
        double side = 4;
        double l = 5;
        double b = 8;

        System.out.println("Area of Square :  " + AP.area(side));
        System.out.println("Area of rectangle :  " + AP.area(l, b));


        System.out.println("Parameter of Square : " + AP.Parameter(b));
        System.out.println("Parameter of Rectangle : " + AP.Parameter(l, b));
       

    }

    
}

