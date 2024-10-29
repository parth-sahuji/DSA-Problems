//package DSA Question;

import java.util.Scanner;

public class waterlevelprec {

    public static void leftmax(int arr[] , int leftarr[]) {
        leftarr[0] = arr[0];
        for(int i=1;i<arr.length;i++) {
            leftarr[i] = Math.max(arr[i], leftarr[i-1]);
        }
    }

    public static void rightmax(int arr[] , int rightarr[]) {
        rightarr[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--) {
            rightarr[i] = Math.max(arr[i], rightarr[i+1]);
        }
    }

    public static int rainwaterlevel (int arr[] , int leftarr[] , int rightarr[]) {
        leftmax(arr, leftarr);
        rightmax(arr, rightarr);
        int areacovered = 0 ;

        for(int i=0;i<arr.length;i++) {
            int rainlevel = Math.min(leftarr[i], rightarr[i]);

            areacovered += rainlevel-arr[i];
        }

        return areacovered;
    }
   public static void main(String[] args) {
        System.out.println("HARIOM");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of area : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Size of Buildings : ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        int leftarr[] = new int[n] ;
        int rightarr[] = new int[n] ;
        System.out.println(rainwaterlevel(arr, leftarr, rightarr));
   } 
}
