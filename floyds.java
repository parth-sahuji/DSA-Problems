import java.util.Scanner ;
public class floyds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("000000");
        System.out.println("Entewr number of lines : ");
        int n = sc.nextInt();
        int a = 1 , b = 1 ; 
        for(int i = 0 ; i<n ; i++)
        {
            for(int j = 0 ; j<=i ; j++)
            {
                System.out.print(a+" ");
                a++;
            }
            System.out.println(" ");
        }
    }
}
