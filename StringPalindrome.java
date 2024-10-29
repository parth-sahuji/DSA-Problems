// package STRINGSS;
import java.util.Scanner;

public class StringPalindrome {

    public static boolean ispalin(String input) {
        for(int i=0;i<input.length()/2;i++) {
            if(input.charAt(i) != input.charAt(input.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("HARIOM");

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        sc.close();

        if (ispalin(input)) {
            System.out.println("The string is a palindrome.");
        } 
        else {
            System.out.println("The string is not a palindrome.");
        }
    }    
}
