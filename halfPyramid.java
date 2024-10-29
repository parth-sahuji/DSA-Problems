import java.util.Scanner  ; 
public class halfPyramid {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 

        System.out.println("--------------------");
        int n  ; 
        System.out.print("Enter Number of Lines you Want to PRINT : ");
        n = sc.nextInt(); 
        System.out.println("HERE is Your OUTPUT . .. ... .... ");
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(j + " " );
            }
            System.out.print("\n");
        }
    }
}


