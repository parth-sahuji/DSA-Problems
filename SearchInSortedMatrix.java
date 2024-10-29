import java.util.Scanner;

public class SearchInSortedMatrix {
    public static boolean search(int matrix[][] , int key) {
        int row = 0 , col = matrix[0].length-1;

        while(row<matrix.length && col>=0) {
            if(matrix[row][col] == key) {
                System.out.println("found key at (" + row + "," + col + ")");
                return true ;
            }

            else if(key < matrix[row][col]) {
                col--;
            }

            else {
                row++;
            }
        }
        System.out.println(key + "Not Found");
        return false ;
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
        System.out.print("Enter Element to be searched : ");
        int key = sc.nextInt();
        sc.close();

        search(matrix, key);
    }
}