import java.util.Scanner;

public class repetedNumber {

    public static boolean ifrepeating(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[j] == arr[i]) {
                    System.out.println(arr[j] + " is repeating");
                    return true ; 
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("HARI OM");

        Scanner sc = new Scanner(System.in);

        System.out.print("How Many Numbers : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter Array Elements : ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Your array is : ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+ " " );
        }
        System.out.println();
        System.out.println(ifrepeating(arr));
        sc.close();
    }
}
