package Sort;
import java.util.Arrays;
import java.util.Collections;
public class inbuiltSort {
    public static void main(String[] args) {
        System.out.println("HARIOM");

        Integer arr[] = {5,6,4,684,5,77,75};

        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        Arrays.sort(arr,1,3);

        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr,1,3,Collections.reverseOrder());
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
