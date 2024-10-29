// package STRINGSS;

import java.util.Scanner;

public class cahrAt {

    public static void print(String name) {
        for(int i=0; i<name.length();i++) {
            System.out.print(name.charAt(i) + " ");
        }
    }
    public static void main(String[] args) {
        System.out.println("HARIOM");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println(name.length());

        print(name);
    }
}
