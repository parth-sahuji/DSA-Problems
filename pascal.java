import java.util.Scanner;

public class pascal {

    public int factorial(int a) {
        if (a == 0) {
            return 1;
        }
        return a * factorial(a - 1);
    }

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println(">>>>>>>");

        System.out.print("Enter Number of Rows: ");
        int n = sc.nextInt();

        System.out.println("So you have to Print " + n + " lines");

        for (a = 0; a < n; a++) {
            for (b = 0; b < n - a; b++) {
                System.out.print(" ");
            }

            for (b = 0; b <= a; b++) {
                System.out.print(" " + new pascal().factorial(a) / (new pascal().factorial(a - b) * new pascal().factorial(b)));
            }

            System.out.println();
        }
    }
}
