//package recursion;
import java.util.*;
public class fibonacci {
    public static int fibo(int n ) {
        if (n == 0)
        {
            return 0 ; 
        }
        else if (n == 1)
        {
            return 1 ; 
        }
        int fib1 = fibo(n-1);
        int fib2 = fibo(n-2);
        int fib = fib1 + fib2 ;
        return fib;
    }
    public static void main(String[] args) {
        System.out.println("HARE KRISHNA ");
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter Input : ");
        int n = sc.nextInt();
        System.out.println("Required element at position " + n + " is :" + fibo(n));
    }
}
