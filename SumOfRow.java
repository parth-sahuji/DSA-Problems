import java.util.Scanner;

public class SumOfRow {

    public static void rowsum(int arr[][] , int row) {
        int i = row-1 , j=0 , sum = 0;
        while(j<arr[0].length) {
            sum += arr[i][j];
            j++;
        }
        System.out.println("Sum is : " + sum);
    }
    public static void main(String[] args) {
        System.out.println("HARIOM");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Square Matrix : ");
        int size = sc.nextInt();

        int arr[][] = new int [size][size];

        System.out.println("Enter Data into matrix : ");
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter Which row sum you wan t : ");
        int row = sc.nextInt();
        sc.close();

        rowsum(arr, row);
    }
}
