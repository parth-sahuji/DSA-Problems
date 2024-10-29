import java.util.*;
public class sorted {
    public static boolean checkSorted(int[] arr , int n , int i) {

        if(i == arr.length-1)
        {
            return true ; 
        }
        if(arr[i] > arr[i+1]) {
            return false ; 
        }
        return checkSorted(arr, n, i+1) ; 
    }
    public static void main(String[] args) {
        System.out.println("\n\nHARI OM\n\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements into the array : ");
        for(int i = 0 ; i<n ; i++) {
            arr[i] = sc.nextInt();            
        }

        System.out.println("Your Array is : ");
        for(int i = 0 ; i<n ; i++) {
            System.out.println(arr[i]);
        }

        int i = 0 ;
        System.out.println(checkSorted(arr, n , i ));
        sc.close();
    }
}
