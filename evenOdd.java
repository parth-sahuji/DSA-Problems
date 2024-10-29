import java.util.*;
public class evenOdd {

    public static void evenorodd (int n ) {
        int bitMask = 1;
        if((n & bitMask) == 0 ) {
            System.out.println("Even number '.' \n");
        }

        else {
            System.out.println("Odd Number '.' ");
        }
    }
    public static void main(String[] args) {

        System.out.println("\n\nJAI SIYA RAM :: ::\n\n");

        evenorodd(8);
        evenorodd(5);

    }
}
