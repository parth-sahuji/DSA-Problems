import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        System.out.println("___________________");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of ROWS : ");
        int rows = sc.nextInt();
        System.out.print("Enter Number Of COLUMNS : ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];
        int[][] transpose = new int[columns][rows];

        System.out.println("You Have to input elements for " + rows + "X" + columns + " matrix . . . . . . . ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element for " + (i + 1) + "," + (j + 1) + ": ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Your MATRIX is : ");
        displayMatrix(matrix);

        // Calculate the transpose
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("TRANSPOSE OF YOUR MATRIX IS  .............");
        displayMatrix(transpose);
    }

    // Function to display a matrix
    public static void displayMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
}
