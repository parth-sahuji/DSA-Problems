import java.util.Scanner ; 
public class updation {
    public static void main(String[] args) {
        System.out.println("##########################################");

        Scanner sc = new Scanner(System.in) ; 

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

            


            while (true) 
            {

                System.out.println("\n Do you want to update your array : \n 1. YES \n 2.NO \n");
                c = sc.nextInt();
               
                switch (c) 
                {
                    case 1:
                        System.out.print("Enter the position at which you want to update the element  : ");
                        pos = sc.nextInt();

                        if (pos>a) 
                        {
                            System.out.println("Enter correct Values : : : : : ");
                        }

                        else 
                        {

                        
                            if(n == a)
                            {
                                System.out.println("NO SPACE | . . . | ");
                            }
                            else
                            {
                                System.out.print("Enter the element which is to be Updated : ");
                                ele = sc.nextInt();

                                arr[pos - 1] = ele ; 
                            
                                 ; 
                                System.out.println("element updated +++++++++++++++++++");
                                System.out.println("After Updation Your Array is :   ");
                                for(i=0 ; i<n ; i++)
                                {
                                    System.out.print(arr[i] + " , ");
                                }

                            }
                        }
                    
                        break;

                    case 2 :    
                        System.out.println("thanks .........,,,,,,,,,,,,,");
                        System.exit(0); 
                        break ;    
            
                    default:
                        System.out.println("Enter valit input ================");
                        break;    
                }


                
            }
        }   
        sc.close();

    }
}
