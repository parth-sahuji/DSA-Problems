package Sort;
import java.util.Scanner;
public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============");


        int a=0,b=0,c=0,i=0,j=0,n=0,pos=0,ele=0;
        System.out.print("Enter Number of element in array : ");
        a = sc.nextInt();

        int[] arr ; 
        System.out.print("How many elements you want to Enter : ");
        b = sc.nextInt() ;
        arr = new int[a];
        if(b>a || b<0 )
        {
            System.out.println("Enter correct values > . . . <  ");
        }
        else
        {
            for( i=0 ; i<b ; i++ )
            {
                System.out.print("Enter element at index " + i + ": ");
                arr[i] = sc.nextInt();
                n++ ;
            }

            System.out.println("Your array is  :");
            for(i=0 ; i<b ; i++)
            {
                System.out.print(arr[i] + " , ");
            }


            System.out.println("Do you want to sort the elements : \n 1.yes \n 2.no");
            c = sc.nextInt();

            switch(c)
            {
                case 1 : 
                    for(i=0 ; i<b-1 ; i++)
                    {
                        for(j=0 ; j<b-i-1 ; j++)
                        {
                            if(arr[j] > arr[j+1])
                            {
                                c = arr[j+1] ; 
                                arr[j+1] = arr[j] ; 
                                arr[j] = c ; 
                            }
                        }
                    }
                    System.out.println("Sorted array  is : ");
                    for(i=0 ; i<b ; i++)
                    {
                        System.out.print(arr[i] + " , ");
                    }
                    break ; 

                
                case 2 :
                    System.out.println("oK Thanks >'_'<");
                    System.exit(0);
                    break ; 


                default : 
                    System.out.println("Enter valid Innput (;");
                    
            }
        }
        sc.close();
    }
}


