import java.util.Scanner ;
import java.util.Arrays ;
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("Hello");

        Scanner sc = new Scanner(System.in);
        int i,j,n,k,p;

        System.out.print("Enter number of elements in Fibonacci series you want : ");
        n = sc.nextInt() ;

        System.out.print("Enter first element from you want to start : ");
        i = sc.nextInt();

        System.out.print("Enter second element : ");
        j = sc.nextInt();


        if(i<0){
            System.out.println("Enter Number Greater than 0 ...");
        }
        else if (j>10){
            System.out.println("Second number cannot be greater than 10 ...");
        }
        else{
        System.out.println(i);
        System.out.println(j);
        for(k=0;k<=n-3;k++){

            p = i + j  ;

            System.out.println(p);
            i = j ;
            j = p ; 
            
        }
        }
    }    
}

