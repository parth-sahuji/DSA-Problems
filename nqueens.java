//package Backtracking;

import java.util.Scanner;

public class nqueens {

    static int count = 0 ;



    public static void printBoard(char board[][]) {
        System.out.println("-----------------CHESS\tBOARD---------------------");
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board.length;j++) {
                System.out.print(board[i][j] + " " );
            }
            System.out.println();
        }
    }



    public static boolean issafe(char board[][] , int row , int col) {
        //vertical up 

        for(int i = row-1 ; i>=0 ; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }
        //diagonal left up 

        for(int i = row-1 , j= col-1;i>=0 && j>=0 ; i--,j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        } 

        //diagonal right up 
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }


    public static void quen(char board[][] , int row) {

        if(row == board.length) {
            printBoard(board);
            count++;
            return;
        }

        for(int j=0;j<board.length;j++) {

            if(issafe(board , row , j)) {
                board[row][j] = 'Q';
                quen(board, row+1);
                board[row][j] = '.';
            }           
        }
    }



    public static boolean onequen(char board[][] , int row) {

        if(row == board.length) {
            printBoard(board);
            count++;
            return true;
        }

        for(int j=0;j<board.length;j++) {

            if(issafe(board , row , j)) {
                board[row][j] = 'Q';
                if(onequen(board, row+1)) {
                    return true;
                }
                board[row][j] = '.';
            }           
        }
        return false;
    }


    
    public static void main(String[] args) {
        System.out.println("\n\nHARIOM\n\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER SIZE OF CHESS BOARD : ");
        int n = sc.nextInt() ; 
        char board[][] = new char[n][n];

        //initiate

        for(int i=0 ; i<n ; i++) {
            for(int j=0  ; j<n ; j++) {
                board[i][j] = '.';
            }
        }

        quen(board, 0);
        System.out.println("\n\nTotal solutions are : " + count);
        System.out.println("\n\n");
        onequen(board, 0);
        sc.close();
    }
}
