import java.util.Scanner;

public class tilingproblem {


    public static int tileprob(int n ) {
        // 2 x n (floor size)

        if(n==0 || n==1) {
            return 1;
        }


        // Horizontal
        int fnm1 = tileprob(n-1);

        // Vertical 
        int fnm2 = tileprob(n-2);

        int ans = fnm1 + fnm2 ; 
        return ans ; 
    }


    public static void main(String[] args) {
        System.out.println("\n\nHARIOM\n\n");

        // height of floor = 2

        System.out.print("Insert Width of floor : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print("Total ways are : " + tileprob(n));
        sc.close();
    }
}
