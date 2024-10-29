//package recursion;

    import java.util.*;

    
    public class DECorder {

        public static void printDEC(int n ) {
            if( n == 1 ) {
                System.out.print(n);
                return ;                 
            }
            
            System.out.print(n+" ");
            printDEC(n-1);
        }


        public static void printINC(int n ) {
            if( n == 1 ) {
                System.out.print(n);
                return ;                 
            }
            
            printDEC(n-1);
            System.out.print(n+" ");
        }




        public static void main(String[] args) {

            System.out.println("\n\nJAI SIYA RAM\n\n ");
            Scanner sc = new Scanner(System.in);

            System.out.print("enter start num : ");
            int n ;
            n = sc.nextInt();

            printDEC(n);
            printINC(n);

            sc.close();
    }
}