import java.util.Scanner;

public class numberOfRepet {

    public static void repetnumber(int matrix[][] , int key) {
        int rep = 0 ;

        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                if (matrix[i][j] == key ) {
                    rep++;
                }
            }
        }
        if(rep == 0) {
            System.out.println(key + " Not found");
        }
        else {
            System.out.println("Number of times " + key + "repeated in array is " + rep);
        }
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

        repetnumber(matrix, key);
    }
}