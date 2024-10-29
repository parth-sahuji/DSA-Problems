import java.util.Scanner;

public class qquenSelf 
{

    static int count = 0 ; 

    public static void placequen(char board[][] , int row)
    {
        if(row == board.length) 
        {
            printBoard(board);
            count++;
            return;
        }

        for(int j=0;j<board.length;j++) 
        {

            if(safe(board , row , j)) {
                board[row][j] = 'Q';
                placequen(board, row+1);
                board[row][j] = '.';
            }           
        }
    }


    public static void numquen(char board[][] , int row)
    {
        if(row == board.length)
        {
            count++;
            return;
        }

        for(int i = 0 ; i<board.length ; i++)
        {
            if(safe(board , row , i))
            {
                board[row][i] = 'Q';
                numquen(board, row+1);
                board[row][i] = '.';
            }
        }
    }



    public static boolean placeanyquen(char board[][] , int row)
    {
        if(row == board.length) 
        {
            printBoard(board);
            count++;
            return true;
        }

        for(int j=0;j<board.length;j++) 
        {

            if(safe(board , row , j)) 
            {
                board[row][j] = 'Q';
                if(placeanyquen(board, row+1)) 
                {
                    return true;
                }
                board[row][j] = '.';
            }           
        }
        return false;
    }



    public static boolean safe(char board[][] , int row ,  int col )
    {
        //vertical up
        for(int i = row-1 ; i>=0 ; i--) 
        {
            if(board[i][col] == 'Q') 
            {
                return false;
            }
        }


        //diagonal left up 

        for(int i = row-1 , j= col-1;i>=0 && j>=0 ; i--,j--) 
        {
            if(board[i][j] == 'Q') 
            {
                return false;
            }
        } 
        

        //diagonal right up 
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) 
        {
            if (board[i][j] == 'Q') 
            {
                return false;
            }
        }
        return true;
    }



    public static void printBoard(char board[][])
    {
        System.out.println("----------------------CHESS\tBOARD----------------------");
        for(int i = 0 ; i<board.length ; i++)
        {
            for(int j = 0 ; j<board.length ; j++)
            {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        
    }


    public static void main(String[] args) {
        System.out.println("\n\nHAR HAR MAHADEV\n\n");

        Scanner sc = new Scanner(System.in);


        while(true)
        {

        
            count = 0 ; 
            System.out.print("Enter size of Board : ");
            int n = sc.nextInt();

            char board[][] = new char[n][n];


            for(int i = 0 ; i<board.length ; i++)
            {
                for(int j = 0 ; j<board.length ; j++)
                {
                    board[i][j] = '.';
                }
            }


        
            System.out.print("1.Print All solutions \t 2.Number of Boards \t 3.Print any one solution \t 4.Exit \nYour Input : ");
            int ch = sc.nextInt();

            switch(ch) 
            {

                case 1 :
                    System.out.println("So we will print all the solutions :  ");
                    placequen(board , 0);
                    break ; 


                case 2 : 
                    System.out.println("So we will print the numver of solutions :  ");
                    numquen(board, ch);
                    System.out.println("toat solutions are : " + count);
                    break;


                case 3 :
                    System.out.println("So we will print any one solution :  ");
                    placeanyquen(board, ch);
                    break;


                case 4 :
                    System.out.println("Thank you so much ........");
                    System.exit(0);
                    sc.close();
                    break;


                default : 
                    System.out.println("Enter the correct Input .....");
                    break;

            }           
        }              
    }
}
