import java.util.Scanner;

public class stockProfit {

    public static int buyAndSell (int arr[]) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0 ;

        for(int i=0;i<arr.length;i++) {
            if(buyprice>arr[i]) {
                buyprice = arr[i] ; 
            }
            else {
                int profit = arr[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        System.out.println("HARI OM");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Tragetted Days : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter prices : ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("MAX PROFIT = " + buyAndSell(arr));
        sc.close();
    }
}
