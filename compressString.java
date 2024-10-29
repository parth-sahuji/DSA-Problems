// package String Builder;

import java.util.Scanner;

public class compressString {
    public static String compress(String str) {
        String newstr = "";
        for(int i=0;i<str.length();i++) {
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if(count>1) {
                newstr += count.toString();
            }
        }
        return newstr;
    }
    public static void main(String[] args) {
        System.out.println("HARIOM");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String to be compressed : ");
        String str = sc.nextLine();

        System.out.println(compress(str));
        sc.close();
    }
}