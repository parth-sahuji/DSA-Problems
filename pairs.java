//package Array;

public class pairs {

    public static void printpair(int arr[], int tulli) {
        tulli = 66 ;
        for(int i = 0 ; i<arr.length ; i++) {
            for(int j = i+1 ; j<arr.length ; j++) {
                System.out.print("("+arr[i] + "," + arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("HARIOM");

        int arr[] = {1,2,4,8,16};
        int tulli = 6;
        printpair(arr,tulli);
        System.out.println(tulli);
    }
}
