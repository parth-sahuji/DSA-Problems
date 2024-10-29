//package recursion;
import java.util.*;

public class factorial {
    public static int factorialAns(int n) {
        if( n == 0 ) {
            return 1 ;
        }
        int fnm1 = factorialAns(n-1);
        int fn = n *fnm1;
        return fn ; 
    }
    public static void main(String[] args) {
        System.out.println("\n\nJAI SIYA RAM\n\n");
        System.out.print("Insert Value : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.print("Your answer is : ");
        System.out.println(factorialAns(n));
    }
}
