import java.util.Scanner;

public class quicksort {

    public static void printarr(int arr[]) {
        for(int i = 0 ; i<arr.length ; i++) {
            System.out.print(arr[i] + " ");
        
        }
        System.out.println("");
    }

    public static void sorting(int arr[] , int si , int ei) {
        if(si>=ei) {
            return;
        }

    int index = partition(arr , si ,ei) ;

    sorting(arr, si, index-1);//left
    sorting(arr, index+1, ei);//right

    }


    public static int partition(int arr[] , int si , int ei) {
        int pivot = arr[ei] ; 
        int  i  = si-1 ; 

        for(int j = si ; j<ei ; j++) {
            if(arr[j] < pivot) {
                i++ ; 
                int temp = arr[j] ; 
                arr[j] = arr[i];
                arr[i] = temp ; 
            }
        }

        i++ ; 
        int temp = pivot ; 
        arr[ei] = arr[i];
        arr[i] = temp ; 

        return i ;
    }
    public static void main(String[] args) {
        System.out.println("\n\nHARIOM\n\n");
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("Size of Array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];


        System.out.println("Enter Array Elements : ");
        for(int i = 0 ; i<n ; i++) {
            arr[i] = sc.nextInt() ; 
        }
        //int arr[] = {32,13,43,65,23,1,90,50};

        printarr(arr);

        sorting(arr, 0, arr.length-1);

        printarr(arr);
    }
}
