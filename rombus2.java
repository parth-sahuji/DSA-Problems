import java.util.Scanner;

public class rombus2 {
    public static void main(String[] args) {
        System.out.println("\n\n\n===\n\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\n\n");
        System.out.print("Enter number of lines of rombus : ");
        int n = sc.nextInt();
        int i  = 0 , j = 0 ;
        for( i =0 ; i<n  ; i++ )
        {
            for( j = 0 ; j<(n-i) ; j++)
            {
                System.out.print(" ");
            }
            

                for( j = 0 ; j < n ; j++ )
                {
                    if(i==0 || j==0 || i == n-1 || j == n-1 )
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                    
                }
            
            
            System.out.println();
        }
    }
}
