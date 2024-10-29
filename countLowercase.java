import java.util.Scanner;

public class countLowercase {
    public static void lower(String str) {
        int count = 0 ;

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
                count++;

                sb.append(str.charAt(i));
                sb.append(" ");
            }
            
        }

        System.out.println("No of Vovels in lower case is : " + count);
        System.out.println("Lowercase Vovels are : " + sb);
    }
    public static void main(String[] args) {
        System.out.println("HARIOM");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = sc.nextLine();

        lower(str);

        sc.close();
    }
}
