import java.util.Scanner;
public class square {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        System.out.println(",,,,,");
        int a  ;
        System.out.print("Enter number of Lines : ");
        a = sc.nextInt();   
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                // Print '*' if it's the first row, first column, last row, or last column
                if (i == 1 || j == 1 || i == a || j == a) {
                    System.out.print("* ");
                }
                 else {
                    // Print a space for internal positions
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
