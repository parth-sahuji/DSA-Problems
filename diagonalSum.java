import java.util.Scanner;

public class diagonalSum {

    public static void diagonal (int matrix[][]) {
        int sum = 0 ;
        
        // for(int i=0;i<matrix.length;i++) {
        //     for(int j=0;j<matrix[0].length;j++) {
        //         if(i==j) {
        //             sum += matrix[i][j];
        //         }
        //         if(i+j == matrix.length-1) {
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        for(int i=0;i<matrix.length;i++) {
            //pd 
            sum += matrix[i][i] ;

            //sd 
            if(i!= matrix.length-1-i) {
                sum += matrix[i][matrix.length-1-i] ;
            }
        }        
       System.out.println("Sum of Diagonals is = " + sum + "." );
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
        diagonal(matrix);
    }
}
