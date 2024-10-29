import java.util.Scanner;

public class spiral {

    public static void spiralPrint(int matrix[][]) {
        int startrow = 0 ; 
        int startcol = 0 ;
        int endrow = matrix.length-1 ;
        int endcol = matrix[0].length-1 ;

        while(startrow <= endrow && startcol <= endcol) {
            //top
            for(int j=startcol ; j<=endcol ; j++) {
                System.out.print(matrix[startrow][j] + " ");
            }

            // right
            for(int i=startrow+1 ; i<=endrow ; i++) {
                System.out.print(matrix[i][endcol]+ " ");
            }

            //bottom
            for(int j=endcol-1 ; j>=startcol ; j--) {
                if(startrow==endrow) {
                    break;
                }
                System.out.print(matrix[endrow][j]+ " ");
            }

            //left
            for(int i=endrow-1 ; i>startrow ; i--) {
                if(startcol==endcol) {
                    break;
                }
                System.out.print(matrix[i][startcol]+ " ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("HARIOM");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Square Matrix : ");
        int size = sc.nextInt();

        int matrix[][] = new int [size][size];

        System.out.println("Enter Data into matrix : ");
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        sc.close();

        spiralPrint(matrix);
    }
}
