import java.util.*;
public class getIthBit {
    public static int getBit(int n , int i  ) {
        int bitMass = 1<<i ; 
        if((n & bitMass) == 0)
        {
            return 0 ; 
        }

        else {
            return 1 ;
        }
    }

    public static int setIthBit(int n , int i) {
        int bitMass = 1<<i ;
        return n | bitMass ; 
    }



    public static int updateIthBit( int n , int i , int newBit ) {
        
    }
    public static void main(String[] args) {
        System.out.println("\n\nJAI BAJRANGBALI \\  \n\n");
        System.out.println(setIthBit(130, 1));
    }
} 




