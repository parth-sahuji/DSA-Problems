import java.util.Scanner;

public class trappedwater {


    

    public static void rightmax(int arr[] , int rightmaxarr[]) {
        rightmaxarr[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--) {
            rightmaxarr[i] = Math.max(arr[i],rightmaxarr[i+1]);
        }
    }


    public static void leftmax(int arr[],int leftmaxarr[]) {
        leftmaxarr[0] = arr[0];
        for(int i=1;i<arr.length;i++) {
            leftmaxarr[i] = Math.max(arr[i], leftmaxarr[i-1]);
        }
    }


    public static int waterlevel(int arr[] , int leftmaxarr[] , int rightmaxarr[]) {
        rightmax(arr, rightmaxarr);
        leftmax(arr, leftmaxarr);
        int waterarea = 0 ;

        for(int i=0 ; i<arr.length ; i++) {
            int level = Math.min(leftmaxarr[i],rightmaxarr[i]);

            waterarea +=  level-arr[i];
        }
        return waterarea;
    }
    public static void main(String[] args) {
        System.out.println("HARI OM");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");

        int n = sc.nextInt();

        int arr[] = new int[n] ;
        int rightmaxarr[] = new int[n];
        int leftmaxarr[] = new int[n];

        System.out.print("Enter Size of Bars : ");

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Water Trapped is : " + waterlevel(arr, leftmaxarr, rightmaxarr));
        sc.close();
    }
}
