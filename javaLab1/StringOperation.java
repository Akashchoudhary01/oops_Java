import java.util.Arrays;
import java.util.Scanner;

public class StringOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Short in alphabatic order
        System.out.print("Enter Your String : ");
        String str = sc.next();
        char [] arr = str.toCharArray();
        Arrays.sort(arr);
        String sorted = new String(arr);
        System.out.println(sorted);

        //check Substring
        System.out.println("Substring Check");

        System.out.print("Enter The String s1 : ");
        String s1 = sc.next();
        sc.nextLine();
        System.out.print("Enter The String s2 : ");
        String s2 = sc.next();

        if(s1.contains(s2)){
            System.out.println("Substring Found !");
        }else{
            System.out.println("Substring not Found !");
        }

        //Convert the String in Uppercase
        System.out.print("Enter The String str1 : ");
        String str1 = sc.next();
        System.out.println(str1.toUpperCase());


    }
    
}
