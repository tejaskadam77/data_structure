package pepcoding.recursion;

import java.util.Scanner;

public class KnightTour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        int chess[][] = new int[n][n];
        printKnightsTour(chess, r, c, 1);
    }

    private static void printKnightsTour(int[][] chess, int r, int c, int move) {
        if (r < 0 || c < 0 || r >= chess.length || c >= chess.length || chess[r][c] > 0) {
            return;
        } else if (move == chess.length * chess.length) {
            chess[r][c] = move;
            displayboardChess(chess);
            chess[r][c] = 0;
            return;
        }
        chess[r][c] = move;
        printKnightsTour(chess, r - 2, c + 1, move + 1);
        printKnightsTour(chess, r - 1, c + 2, move + 1);
        printKnightsTour(chess, r + 1, c + 2, move + 1);
        printKnightsTour(chess, r + 2, c + 1, move + 1);
        printKnightsTour(chess, r + 2, c - 1, move + 1);
        printKnightsTour(chess, r + 1, c - 2, move + 1);
        printKnightsTour(chess, r - 1, c - 2, move + 1);
        printKnightsTour(chess, r - 2, c - 1, move + 1);
        chess[r][c] = 0;
    }

    private static void displayboardChess(int[][] chess) {

        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess.length; j++) {
                System.out.println(chess[i][j] + " ");
            }
            System.out.println();
        }
    }
}
