import java.util.Scanner;
public class maxsum {

    public static void maximum (int arr[]) {
        int currsum = 0 ; 
        int maxsum = 0 ; 

        for(int i=0;i<arr.length;i++) {
            
            int start = i ; 
            for(int j=i;j<arr.length;j++) {
                int end = j ; 
                currsum = 0;
                for(int k=start ; k<=end ; k++) {
                    currsum = currsum + arr[k];
                }

                System.out.println(currsum);

                if(currsum>maxsum) {
                    maxsum = currsum;
                }
            }
        }

        System.out.println("Max Sum is : " + maxsum);
    }

    public static void main(String[] args) {
        System.out.println("HARI OM");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array : ");
        int n = sc.nextInt();

        int arr[] = new int [n] ; 

        System.out.println("Enter Array Elements : ");

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Your Array is : ");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " " );
        }
        System.out.println();

        maximum(arr);
    }
}
