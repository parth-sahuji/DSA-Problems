import java.util.Scanner;

public class rombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\n\n");
        System.out.print("Enter number of lines of rombus : ");
        int n = sc.nextInt();
        for(int i =0 ; i<n  ; i++ )
        {
            for(int j = 0 ; j<(n-i) ; j++)
            {
                System.out.print(" ");
            }
            for(int j = 0 ; j < n ; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
