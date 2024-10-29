import java.util.Scanner;

public class moteQ1 {


    public static void record(int arr[] , int noei) {
        Scanner sc = new Scanner(System.in);

        int num = noei  ;
        int num1 = num+1 ;
        System.out.println("Enter new score at "+ num1);

        arr[num] = sc.nextInt();

        

        System.out.println("Your Array is : ");

        for(int i = 0 ; i<num1 ; i++ ) {
            System.out.println(arr[i] + " ");
        }

    }


    public static void sum(int arr[] , int noei) {

        int num = noei  ;
        int num1 = num+1 ;
        int newumm1 = num-1 ; 
        arr[num] = arr[num-2] + arr[newumm1];

        System.out.println("Your Array is : ");

        for(int i = 0 ; i<num1 ; i++ ) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void doublee (int arr[] , int noei) {
        int num = noei  ;
        int num1 = num+1 ;
        int doubleofprev = arr[num-1];
        doubleofprev = doubleofprev * 2 ; 

        arr[noei] = doubleofprev ; 

        

        System.out.println("Your Array is : ");

        for(int i = 0 ; i<num1 ; i++ ) {
            System.out.println(arr[i] + " ");
        }
    }


    public static void rem (int arr[] , int noei) {
        int num = noei  ;
        int numm1 = num-1;

        System.out.println("Your Array is : ");

        for(int i = 0 ; i<numm1 ; i++ ) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("HARIOM");

        Scanner sc = new Scanner(System.in);

        int noei = 2 ; 

        System.out.println("Size of Array : ");
        int n = sc.nextInt();

        int arr[] = new int [n] ; 

        System.out.println("Enter First 2 scores : ");

        for(int i=0;i<2;i++) {
            arr[i] = sc.nextInt();
        }


        while(true) {
            System.out.println("Which operation :\n x : record new score \t + : sum of prev 2 \t d : double of prev \t c : remove prev \t e : exit ");

            char ch = sc.next().charAt(0);

            switch(ch) {
                case 'x' : 
                    record(arr, noei);
                    noei++;
                    break ; 

                case '+' :
                    sum(arr, noei);
                    noei++;
                    break;

                case 'd' : 
                    doublee(arr, noei);
                    noei++;
                    break;

                case 'c' : 
                    rem(arr, noei);
                    noei--;
                    break ; 

                case 'e' : 
                    System.exit(0);
                    sc.close();
                    break ; 
            }
        }
        
    }
}
