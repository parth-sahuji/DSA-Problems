//package recursion;

//package recursion;
import java.util.*;
public class sumOfNnumber {

    public static int son(int n ) {
        if(n == 1 ) {
            return 1 ; 
        }
        int fn1 = son(n-1);
        int fn = n + fn1 ; 
        return fn ; 
    }
    public static void main(String[] args) {
        System.out.println("\n\nHAR HAR MAHADEV\n\n");
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter number to which you want sum : ");
        int n =sc.nextInt();
        System.out.println( "Your sum is : " +son(n));
    }
}
