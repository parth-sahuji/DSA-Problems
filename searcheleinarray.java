import java.util.Scanner ;
public class searcheleinarray {

    public static int firstocvcurance(int[] arr , int sk , int i ) {
        if(i == arr.length) {
            System.out.println("NOT FOUND");
        }
        if(arr[i] == sk) {
            return i ; 
        }
        return firstocvcurance(arr, sk, i+1);
    }


    public static int lastocvcurance(int[] arr , int sk , int i ) { 


        if(i == arr.length) {
            System.out.println("NOT FOUND");
            return -1 ;  
        }

        int isFound = lastocvcurance(arr, sk, i+1) ;
        if(isFound == -1  && arr[i] == sk) {
            return i  ;
        }

        return isFound ; 



    }


    
    public static void main(String[] args) {
        System.out.println("\n\nJAI SIYA RAM  \n\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements : ");
        for(int i = 0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 1 ;
        System.out.print("Enter element to search : ");
        int sk = sc.nextInt();
        System.out.println(lastocvcurance(arr, sk , i));

        sc.close();
    }
}
