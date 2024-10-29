import java.util.Scanner;

public class butterfly {
    public static void main(String[] args) {
        System.out.println("HELLO ><");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines :");
        int n = sc.nextInt();
        for(int i = 0 ; i<n ; i++)
        {
            for(int j = 0 ; j < i ; j++ )
            {
                System.out.print("*");
            }
            for(int j = 0 ; j <2*(n-i) ; j++ )
            {
                System.out.print(" ");
            }
            for(int j = 0 ; j < i ; j++ )
            {
                System.out.print("*");
            }
            System.out.println( " ");

        }
        
        
        for(int i = n ; i>1 ; i--)
        {
            for(int j = 0 ; j < i ; j++ )
            {
                System.out.print("*");
            }
            for(int j = 0 ; j <2*(n-i) ; j++ )
            {
                System.out.print(" ");
            }
            for(int j = 0 ; j < i ; j++ )
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}