import java.util.Scanner;
public class binarystring {

    public static int printstring(int n , int lastplace , String str) {

        if(n==0) {
            System.out.println(str);
            return 0 ;
        }
        
        if(lastplace == 0) {
            printstring(n-1, 0, str+"0");
            printstring(n-1, 1, str+"1");
            return 0 ;
        }

        else {
            printstring(n-1, 0, str+"0");
            return 0 ;
        }
    }

    public static void main(String[] args) {
        System.out.println("\n\nJAI MAHAKAL\n\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();


        printstring(n, 0, "");
        sc.close();
    }
}
