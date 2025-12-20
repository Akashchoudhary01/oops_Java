import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inter The Value of n : ");
        int n = sc.nextInt();
        double sum  = 0.0;
        for(int i = 1 ; i<= n ; i++){
            sum  += Math.pow(i , 2);
        }
        System.out.println(sum);
    }
    
}
