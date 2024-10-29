import java.util.Scanner ;
public class binary {


    public static void printArr(int arr[] ) {
        System.out.println("Elements of Your Array is  : ");
         for(int i = 0 ; i<arr.length ; i++) {
            System.out.print(arr[i] + " ");
         }
         System.out.println();
    }


    public static void search(int arr[] , int si , int ei , int mid , int ets) {
        if(si > ei) {
            System.out.println("Element not found ");
            return;
        }

        mid = si + (ei - si)/2 ;
        if(ets == arr[mid]) {
            System.out.print("Element found ta index " + mid+1);
        } 
        else if(ets > arr[mid]) {
            si = mid + 1  ;
            ei = arr.length-1 ; 
            search(arr, si, ei, mid, ets);
        }
        else {
            si = 0 ; ei = mid-1 ; 
            search(arr, si, ei, mid, ets);
        }
        System.out.println();
    } 




    public static void sort(int arr[] , int count ) {
        int i , j , temp ; 

        for(i=0;i<arr.length;i++) {
            for(j=0;j<arr.length-i-1;j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j] ;
                    arr[j] = arr[j+1] ; 
                    arr[j+1] = temp ; 
                    count++;
                }
            }
        }
        
    }




    
    public static void main(String[] args) {
        System.out.println("\n\nHARIOM\n\n");
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Size of Array : ");
        int n = sc.nextInt();

        int arr[] = new int[n] ; 

        System.out.println("Enter array elements : ");
        for(int i = 0 ; i<arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        printArr(arr);
        int count = 0  ; 


        while (true) {

            System.out.println("What do you want to do : \n1.Sort \t2.Search \t3.Exit \nour choice : ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    sort(arr,count);
                    System.out.println(("Your array is sorted now "));
                    printArr(arr);
                    break;


                case 2 : 
                    if(count < 1) {
                        System.out.println("Firstly sort the Array ");
                        count++;
                        break;
                    }
                    System.out.print("Enter element to search : ");
                    int ets = sc.nextInt();

                    search(arr, 0, arr.length-1, 0, ets);

                    break ; 



                case 3 : 
                    System.exit(0);
            
                default:
                    System.out.println("Wrong Input");
                    break;
            }           
        }    
    }
}
