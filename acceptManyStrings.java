import java.util.Scanner;
public class acceptManyStrings {
    public static void main(String[] args) {
        System.out.println("HARIOM");

        Scanner sc = new Scanner(System.in);

        System.out.print("How Many strings : ");

        int num = sc.nextInt();

        sc.nextLine();

        String arr[] = new String[num];

        for(int i = 0 ; i<num ; i++) {
            System.out.print("Enter String at " + (i+1) + " : ");
            arr[i] = sc.nextLine();
        }

        System.out.println("You entered:");
        for (int i = 0; i < num; i++) {
            System.out.println(arr[i]);
        }

    }
}
