
import java.util.Scanner;

public class mergesort1 {

    public static void printarr(int arr[]) {
        for(int i = 0 ; i<arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void mergesort(int arr[] , int si , int ei ) {
        if(si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2 ; 
        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);

        merger(arr , si,mid,ei) ; 
    }


    public static void merger(int arr[] , int si , int ei , int mid) { 

        int i = si ; 
        int j = mid+1 ; 
        int k = 0 ; 

        int temp[]  = new int [ei-si+1] ; 

        while(i<=mid && j<=ei) { 
            if(arr[i] < arr[j] ) {
                temp[k] = arr[i] ; 
                i++ ; 
                k++ ; 
            }
            else {
                temp[k] = arr[j] ; 
                j++ ; 
                k++ ; 
            }
        }


        while(i<=mid) {
            temp[k] = arr[i] ;
            k++ ; 
            i++ ; 
        }


        while(j<=ei) {
            temp[k] = arr[j] ; 
            k++ ;
            j++ ; 
        }


        for(k=0,i=si;k<=ei;k++,i++) {
            temp[i] = arr[k] ; 
        }

    }
    public static void main(String[] args) {
        System.out.println("\n\nJAI SIYA RAM \n\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size Of Array : ");
        int n = sc.nextInt();
        int[] arr =  new int[n];

        System.out.println("Enter Array Elements : ");
        for(int i = 0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
        }


        //int arr[] = {23,45,67,89,12,78,-2};
        System.out.println("Before sorting:");
        printarr(arr);
        mergesort(arr, 0,arr.length-1);
        System.out.println("After sorting:");
        printarr(arr);

        sc.close();

    }
}

