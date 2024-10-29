import java.util.Scanner ; 
public class triangle3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n  ;
        System.out.print("Enter Number of lines : ");
        n = sc.nextInt();
        
        int m = 4 ; 
        int p = 1 ; 
        for( int i = 1 ; i<=n ; i++){
            for ( int j = 1 ; j <= i ; j ++  ){
                System.out.print(j + " ");
            }
            System.out.println();
        }
         
    }
}