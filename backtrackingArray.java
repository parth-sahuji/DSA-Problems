//package Backtracking;

public class backtrackingArray {

    
    public static void changeArr(int arr[] , int i , int val) {

        if(i == arr.length) {
            printArr(arr);
            return;
        }


        arr[i] = val ; 
        changeArr(arr, i+1, val+1);
        arr[i] = arr[i] - 2 ; 
    }


    public static void printArr(int arr[]) {
        System.out.println("Your array elements are : ");
        for(int i=0 ; i<arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }


    public static void main(String[] args) {
        System.out.println("\n\nHAR HAR MAHADEV\n\n");

        int arr[] = new int[5] ; 
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}
