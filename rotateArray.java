import java.util.Scanner;

public class rotateArray {

    // public static void rightrotate(int arr[] , int pos) {
    //     int i=pos+1 ;
    //     int j = arr.length-1;

    //     while(i<j) {
    //         int temp = arr[i];
    //         arr[i] = arr[j] ; 
    //         arr[j] = temp ; 
    //         i++;
    //         j--;
    //     }
    // }


    // public static void leftrotate(int arr[] , int pos) {
    //     int i = 0 ;
    //     int j = pos ; 
    //     while(i<j) {
    //         int temp = arr[i];
    //         arr[i] = arr[j] ; 
    //         arr[j] = temp ; 
    //         i++;
    //         j--;
    //     }
    // }

    public static void reverse(int arr[] , int start , int end ) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }



    public static void rotate(int arr[] , int ele) {
        int pos = 0 ;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == ele) {
                pos = i ; 
                break ; 
            }
        }
        // for(int i=pos ;i<arr.length;i++) {
        //     for(int j=0;j<pos;j++) {
        //         int temp = arr[i];
        //         arr[i] = arr[j] ; 
        //         arr[j] = temp ; 
        //     }
        // }

        // rightrotate(arr, pos);
        // leftrotate(arr, pos);

        reverse(arr, 0, pos-1);
        reverse(arr, pos, arr.length-1);
        reverse(arr, 0, arr.length-1);


        System.out.println("YOUR ROTATED ARRAY IS : ");
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i] + " ");
        }
    }


    
    public static void main(String[] args) {
        System.out.println("HARIOM");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Array Elements : ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("YOUR ARRAY IS : ");
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.print("Enter element around which you want to rotate  : ");
        int ele = sc.nextInt();

        //check if element is inside array ir not 
        int found = 0 ;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == ele) {
                found++;
                rotate(arr, ele);
                break;
            }
        }

        if(found==0) {
            System.out.println("Element not found");
            System.exit(0);
        }

        sc.close();
    }
}
