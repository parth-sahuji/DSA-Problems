//package Backtracking;

public class findSubsets {

    public static void find(String str , String ans , int i) {

        if(i == str.length()) {

            if(ans.length() == 0) {
                System.out.println("null");
            }

            else {
                System.out.println(ans);
                
            }
            return;
            
        }


        //main work 
        // if yes 
        find(str, ans+str.charAt(i), i+1);

        // if no 
        find(str, ans, i+1);
    }


    public static void main(String[] args) {
        System.out.println("\n\nHAR HAR GANGE \n\n");

        String str = "abc";
        find(str, "", 0);
    }
}
