import java.util.Scanner;

public class water {

    public static void rightmaximum(int arr[] , int maxright[]) {
        maxright[arr.length-1] = arr[arr.length-1] ; 
        for(int i = arr.length-2 ; i>=0 ; i--) {
            maxright[i] = Math.max(arr[i], maxright[i+1]) ;
        }
    }

    public static void leftmaximum(int arr[] , int maxleft[] ) {
        maxleft[0] = arr[0];
        for(int i=1 ; i<arr.length ; i++) {
            maxleft[i] = Math.max(arr[i], maxleft[i-1]);
        }
    }


    public static int calculate(int arr[] , int maxleft[] , int maxright[]) {

        rightmaximum(arr , maxright); 
        leftmaximum(arr , maxleft); 
         
        int areacovered = 0 ; 

        for(int i=0;i<arr.length;i++) {
            int level = Math.min(maxleft[i], maxright[i]) ; 

            areacovered += level - arr[i] ; 
        }

        return areacovered ;
    }
    public static void main(String[] args) {
        System.out.println("HARI OM");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of area : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        int maxright[] = new int[arr.length] ; 
        int maxleft[] = new int[arr.length] ; 


        System.out.println("Enter Size of Buildings : ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(calculate(arr, maxleft, maxright));
        sc.close();
    }
}
