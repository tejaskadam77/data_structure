package pepcoding.recursion;

import java.util.Scanner;

public class FloodFill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        boolean visited[][]=new boolean[m][n];
        floodFill(arr,0,0,"",visited);
    }

    public static void floodFill(int maze[][],int row,int column,String ans,boolean visited[][])
    {
       if(row<0 || column<0 || row==maze.length || column==maze[0].length || maze[row][column]==1 || visited[row][column]==true)
       {
           return;
       }
           if(row== maze.length-1 && column==maze[0].length-1)
       {
           System.out.println(ans);
           return;
       }
           visited[row][column]=true;

        floodFill(maze,row-1,column,ans+"t",visited);
        floodFill(maze,row,column-1,ans+"l",visited);
        floodFill(maze,row+1,column,ans+"d",visited);
        floodFill(maze,row,column+1,ans+"r",visited);
        visited[row][column]=false;
    }
}
