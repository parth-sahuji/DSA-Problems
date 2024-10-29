import java.util.Scanner;

public class stock {

    public static int stocksprices (int arr[]) {
        int price = 0 ;
        int maxprofit = 0 ; 
        for(int i = 0 ; i < arr.length ; i++ ) {
            int profit = arr[i] - price ; 
            maxprofit = Math.max(maxprofit, profit);
        }
        return maxprofit ;
    }
    public static void main(String[] args) {
        System.out.println("HARIOM");

        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Days : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(stocksprices(arr));

        sc.close();
    }
}
