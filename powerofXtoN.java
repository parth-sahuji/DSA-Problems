import java.util.Scanner;

public class powerofXtoN {

    public static int power(int x , int n) {
        if(n == 1) {
            return x ; 
        }

        int pow = power(x, n-1);
        int ans = x * pow ; 
        return ans ; 
    }


    public static int optimizedpower( int x , int n ) {

        if(n == 0) {
            return 1 ;
        }

        int halfpowsq = optimizedpower(x, n/2) * optimizedpower(x, n/2) ;

        if(n%2 != 0) {
            halfpowsq = x *halfpowsq ; 
        }

        return halfpowsq  ;
    }

    public static void main(String[] args) {
        System.out.println("\n\nHAR HAR MAHADEV \n\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Insert Number : ");
        
        int x = sc.nextInt();

        System.out.print("Insert Power :");
        int n = sc.nextInt();


        sc.close();
        System.out.print("Your answer is : ");
        // System.out.println(power(x, n));
        System.out.println(optimizedpower(x, n));
    }
}
