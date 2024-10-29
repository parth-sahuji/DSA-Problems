//package Divide and Conquer;
import java.util.Scanner ; 
public class mergeSort {

    public static void printArr(int arr[]) { 
        for(int i = 0 ; i<arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return; 
    }


    public static void mergesort(int arr[] , int si , int ei) {

        if(si >= ei) {
            return ; 
        }

        int mid = si + (ei - si) / 2 ;

        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);

        merge(arr,si,mid,ei);
    }



    public static void merge(int arr[] , int si , int mid , int ei) {
        int temp[] = new int[ei-si+1];
        int i = si ; 
        int j = mid+1 ; 
        int k = 0 ;

        while(i<=mid && j<=ei) {
            
            if(arr[i] < arr[j]) {
                temp[k] = arr[i] ; 
                i++ ; 
                k++; 
            }

            else {
                temp[k] = arr[j];
                k++;
                j++ ; 
            }
        }


        while(i <= mid) {
            temp[k++] = arr[i++] ; 
        }


        while(j <= ei) {
            temp[k++] = arr[j++] ; 
        }



        for(k=0,i=si; k<temp.length;k++,i++) {
            arr[i] = temp[k] ; 
        }
    }

 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("\n\nHARIOM\n\n");

        System.out.print("Enter Size Of Array : ");
        int n = sc.nextInt();
        int[] arr =  new int[n];

        System.out.println("Enter Array Elements : ");
        for(int i = 0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
        }

        //int arr[] = {6,7,54,21,45,65,1};

        System.out.println("Before sorting:");
        printArr(arr);


        mergesort(arr, 0 , arr.length-1);
        printArr(arr);

        sc.close();
    }
}
