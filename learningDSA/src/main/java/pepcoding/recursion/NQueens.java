package pepcoding.recursion;

import java.util.Scanner;

public class NQueens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [][]chess= new int[n][n];
        printNqueens(chess,"",0);
    }

    public static void printNqueens(int [][] chess,String qsf,int row)
    {
        if(row== chess.length)
        {
            System.out.println(qsf);
            return;
        }
        for(int column=0;column<chess.length;column++)
        {
            if(isItSafePlaceForQueen(chess,row,column)==true)
            {
                chess[row][column]=1;
                printNqueens(chess ,qsf+row+"-"+column+",",row+1);
                chess[row][column]=0;
            }

        }
    }

    private static boolean isItSafePlaceForQueen(int[][] chess, int row, int column) {
        for(int i=row-1,j= column;i>=0;i--)
        {
            if(chess[i][j]==1)
                return false;
        }
        for(int i=row-1,j= column-1;i>=0 && j>=0;i--,j--)
        {
            if(chess[i][j]==1)
                return false;
        }
        for(int i=row-1,j= column+1;i >=0  && j<=chess.length;i--,j++)
        {
            if(chess[i][j]==1)
                return false;
        }
        return true;
    }
}
