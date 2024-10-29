import java.util.Scanner;

public class matrix4 {
    public static void main(String[] args) {
        System.out.println("___________________");
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("Enter Number of ROWS : ");
        int rows = sc.nextInt();
        System.out.print("Enter Number Of COLUMNS : ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("You Have to input elements for "+ rows + "X"+  columns + " matrix . . . . . . . ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element for " + (i+1) +"," + (j+1) +  ": ") ;
                matrix[i][j]=sc.nextInt() ;
            }
        }

        System.out.println("Your MATRIX is : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t") ;
            }
            System.out.println(" ");
        }
        System.out.println("Upper Triangular Matrix");    
        for ( int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(i==j){
                    System.out.print(matrix[i][j] + "\t") ;
                }
                else{
                    System.out.print("*" + "\t" );
                }
            }
            System.out.println(" ");
        }        
    }
}




