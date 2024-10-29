import java.util.Scanner ; 
public class searchINrotatedArray {

    public static void printArr(int arr[] ) {
        for(int i = 0 ; i<arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static int searching(int arr[] , int si , int ei , int sk) {
        if(si > ei) {
            return -1 ; 
        }

        int mid = (si+ei)/2;

        //L1
        if(arr[mid] == sk) {
            return mid ; 

        }

            
            //Left

        if (arr[si] <= arr[mid]) {

            if(arr[si] <= sk && sk <= arr[mid]) {
            
                return searching(arr, si, mid-1, sk) ; 
            }
    
            else {
                
                return searching(arr, mid+1, ei, sk) ; 
            }
        }    
        
        


        //L2
        else  {

            if(sk >= arr[mid] && arr[ei] >= sk) {
                
                return searching(arr, mid+1 , ei, sk) ;
            }

            else {
                
                return searching(arr, si, mid-1, sk) ;
            }

        }

    }
    public static void main(String[] args) {
        System.out.println("\n\nGANGA MAIYA KI JAI\n\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int n =  sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Elements : ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Your Array is : ");
        printArr(arr);

        System.out.print("Enter Element You Want to Search : ");
        int sk = sc.nextInt();

        int index = searching(arr, 0, arr.length-1 , sk);

        System.out.println(index+1);

        sc.close();
    }
}
