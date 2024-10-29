import java.util.Scanner;

public class zeroOneTriangle {
    public static void main(String[] args) {
        System.out.println("=====");
        System.out.print("Enter nuk=ber of lines : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0 ; i<n ; i++)
        {
            for(int j = 0 ; j<i ; j++)
            {
                int z = i+j ; 
                if(z % 2==0)
                {
                    System.out.print(" 0 ");
                }
                else
                {
                    System.out.print(" 1 ");
                }
            }
            System.out.println(" ");
        }
    }
}
