 import java.util.Scanner ; 
public class arrayProgram {

    static void insertElement(int[] arr, int pos, int ele, int n , int i)
    {
        System.out.println("poly");

        for(i=n ; i>=pos-1 ; i--)
        {
            arr[i+1] = arr[i];
        }
        arr[pos-1] = ele ; 
        n++ ; 
    }


    static void deleteElement(int[] arr, int n, int pos) {
        if (pos < 1 || pos > n) {
            System.out.println("Invalid position. Deletion failed.");
            return;
        }
    
        for (int i = pos - 1; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n--;
    
        System.out.println("Element deleted successfully.");
    }
    



    static void sortElement(int[] arr, int pos, int ele, int n , int i)
    {
        for(i=0;i<=n;i++)
        {
            for(int j = 0 ; j<i ; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int c ;
                    c = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = c ;
                }
            }
        }
    }
    static void search(int[] arr, int pos, int ele, int n , int i)
    {
        boolean found = false;
        for (i = 0; i < n; i++) 
        {
            if (arr[i] == ele) 
            {
                found = true;
                System.out.println("Element found at index " + i);
                break;
            }
        }

        if (!found) 
        {
            System.out.println("Element not found in the array");
        }    
    }


    public static void main(String[] args) 
    {
         
        Scanner sc = new Scanner(System.in);
        int a,b,c,d,i,j,pos=0,ele=0,n=0;
        System.out.println("\n\n\n\n\n===========================================================================\n\n");

        System.out.print("Ente the element you want inside your array :");
        a = sc.nextInt();

        int arr[] ;
        arr = new int[a];

        System.out.print("How many elements you want to enter : ");
        b = sc.nextInt();
        if(b<0 || b>a)
        {
            System.out.println("Enter valid Input");
        }
        else
        {
            System.out.println("Enter array elements :-");
            for(i=0 ; i<b ; i++)
            {
                System.out.print("Enter element at index " + i + ": ");
                arr[i] = sc.nextInt();
                n++ ;
            }

            

            while(true)
            {

                System.out.println("\n Do you want to perform Operations inside to your array : \n1. YES \n2. NO \n :-");
                System.out.println("Your choice : ");
                c = sc.nextInt();

                switch (c)
                {
                    case 1 :
                        System.out.println("\n MENU :\n1. Insert \n2. Delete \n3. Update \n4. Sort Array \n5. Traverse \n6. Search Element inside Array \n7. EXIT \n ");
                        System.out.print("Enter your choice : ");
                        int choice = sc.nextInt();

                        switch (choice) 
                        {
                            case 1 :
                                if(n == a)
                                {
                                    System.out.println("Array is full >><<>><<");
                                }
                                else

                                {
                                    System.out.print("Enter position at which you want to insert Element : ");
                                    pos = sc.nextInt();
                                    if(pos>a || pos<0)
                                    {
                                        System.out.println("Enter valid position +++___+++ ");
                                    }
                                    else
                                    {
                                        System.out.println("Enter element which you Wanted to Enter :  ");
                                        ele = sc.nextInt();

                                        insertElement(arr, pos, ele, n,i);
                                    }
                                }                               
                                break;

                            case 2 : 
                                if(n == 0 )
                                {

                                    System.out.print("Enter position which you want to Delete :  ");
                                    pos = sc.nextInt();
                                    deleteElement(arr , pos , n );
                                }   
                                break ; 


                            case 3 : 
                                System.out.println("Enter the position at which you waned to update the element : ");
                                ele = sc.nextInt();
                                arr[pos-1] = ele ; 
                                System.out.println("\nYour element has been Updat   * _ * \n");
                                break ; 


                            case 4 :
                                System.out.println("Enter Element which you wanted to sort  : ");
                                ele = sc.nextInt() ;

                                sortElement(arr, pos, ele, n, choice);
                                break;


                            case 5 :
                                
                                System.out.println("Your array is : ");
                                for(i=0 ; i<n ; i++ )
                                {
                                    System.out.print(arr[i] + " , ");
                                }
                                break;



                            case 6 : 
                                search(arr, pos, ele, n,i);
                                System.out.print("Enter element which you wanted to search : ");
                                ele = sc.nextInt();
                                break ; 


                            case 7:
                                System.out.println("Thank you so much  >>>>  '.'  <<<<");
                                System.exit(0);
                                break;


                        
                            default:
                                System.out.println("Enter correct input ,.,.,.,.,");
                                break;
                        }
                        break ; 


                    case 2 : 
                        System.out.println("Thank you So Much     >>>>  '.'  <<<<");    
                        break ; 


                    default :
                        System.out.println("Enter Correct Option . . . .");
                        break ;                         
                }
            }
        }
        sc.close();       
    }
}