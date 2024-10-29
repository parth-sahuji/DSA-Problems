//package Array;

import java.util.Scanner;

public class reversearr {
    public static void main(String[] args) {
        System.out.println("HARI OM");

        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Your array is : ");
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
        int i=0;
        int j=arr.length-1;

        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        

        System.out.println("Your new array is : ");
        for(i=0;i<arr.length;i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
