import java.util.Scanner;

public class substrings {

    public static String substri(String str , int si , int ei) {
        String subst = "";
        for(int i=si;i<ei;i++) {
            subst += str.charAt(i); 
        }
        return subst;
    }
    public static void main(String[] args) {
        System.out.println("HARIOM");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");

        String str = sc.nextLine();

        System.out.println(substri(str, 0, 5));

        sc.close();
    }
}
