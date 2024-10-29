import java.util.Arrays;
import java.util.Scanner;
/*You can check if two strings are anagrams by comparing their character counts. 
One common method is to sort both strings and then compare them. 
If the sorted versions of the two strings are the same, they are anagrams. */
public class anagrams {
    public static void compare(String str1 , String str2) {
        String sentance1 = str1.toLowerCase();
        String sentance2 = str2.toLowerCase();

        if(sentance1.length() == sentance2.length()) {
            char[] arr1 = sentance1.toCharArray();
            char[] arr2 = sentance2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            Boolean result = Arrays.equals(arr1, arr2);

            if(result) {
                System.out.println(str1 + " " + str2 + " are Anagram of each other");
            }
            else {
                System.out.println("Ooppss!!! "+str1 + " " + str2 + " are Anagram of each other");
            }
        }
        else {
            System.out.println("Ooppss!!! "+str1 + " " + str2 + " are Anagram of each other");
        }
    }
    public static void main(String[] args) {
        System.out.println("HARIOM");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String 1 : ");
        String str1 = sc.nextLine();

        System.out.print("Enter String 2 : ");
        String str2 = sc.nextLine();

        compare(str1, str2);

        sc.close();
    }
}
