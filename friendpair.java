public class friendpair {

    public static int pairproblem(int n) {
        if( n == 1) {
            return 1 ; 
        }
        if( n == 2 ) {
            return 2 ; 
        }

        int nos = pairproblem(n-1) ; 
        int nop = nos * pairproblem(n-2) ; 
        int ans = nos + nop ; 
        return ans ;  
    }
    public static void main(String[] args) {
        System.out.println("\n\nHAR HAR MAHADEV\n\n");
        int n =  ; 
        System.out.println(pairproblem(n));
    }
}
