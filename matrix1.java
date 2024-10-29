//package Matrices;

import java.util.Scanner;

public class matrix1 {
    public static boolean search(int matrix[][] , int key , int n , int m ) {
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(matrix[i][j] == key) {
                    System.out.println("Found at (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println(key + "Not found ");
        return false;
    }
    public static void main(String[] args) {
        System.out.println("HARIOM");

        int matrix[][] = new int[3][3] ;

        Scanner sc = new Scanner(System.in);

        int n = matrix.length , m = matrix[0].length;

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Your matrix is : ");
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                System.out.print(matrix[i][j] + " "); 
            }
            System.out.println();
        }

        System.out.print("Enter Element to search : ");
        int key = sc.nextInt();
        search(matrix, key, n, m);
        sc.close();
    }
    
}
