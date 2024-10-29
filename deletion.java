import java.util.Scanner ;

public class deletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================");

        System.out.println("*****************");
        int arraySize = 0, numElements = 0, pos = 0;

        System.out.print("Enter the number of elements in the array: ");
        arraySize = sc.nextInt();

        int[] arr;
        System.out.print("How many elements do you want to enter: ");
        numElements = sc.nextInt();
        arr = new int[arraySize];

        if (numElements > arraySize || numElements < 0) {
            System.out.println("Enter correct values > . . . <  ");
        } else {
            for (int i = 0; i < numElements; i++) {
                System.out.print("Enter element at index " + i + ": ");
                arr[i] = sc.nextInt();
            }

            System.out.println("Your array is:");
            for (int i = 0; i < numElements; i++) {
                System.out.print(arr[i] + " , ");
            }

            while (true) {
                System.out.println("\nDo you want to delete an element from your array:\n1. YES\n2. NO\n");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter the position at which you want to delete the element: ");
                        pos = sc.nextInt();
                        for (int i = pos - 1; i < numElements - 1; i++) {
                            arr[i] = arr[i + 1];
                        }
                        numElements--;
                        System.out.println("Element deleted.");
                        System.out.println("\nYour array is:");
                        for (int i = 0; i < numElements; i++) {
                            System.out.print(arr[i] + " , ");
                        }
                        break;

                    case 2:
                        System.out.println("Thanks..........");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Enter valid input ================");
                        break;
                }
            }
        }
    }
}



