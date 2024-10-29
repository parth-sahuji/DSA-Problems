//package Backtracking;

import java.util.Scanner;

public class permutation {


    public static void find(String str , String ans ) {
        int i ;    
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }


        for(i=0;i<str.length();i++) {
            char curr = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i+1);  
            find(newstr, ans+curr);  
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nHAR HAR GANGE \n\n");

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        find(str, "");
    }       
}
