import java.util.Scanner;

public class numPattern {
   
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("_______________");
        int n  ; 
        System.out.print("Enter Number of Lines you Want to PRINT : ");
        n = sc.nextInt();

        int ch = 1 ;
        
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(ch + " " );
                ch++ ;
            }
            System.out.print("\n");
        }
        sc.close();
    }
    
}
