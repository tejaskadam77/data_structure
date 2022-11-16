package pepcoding.recursion;

import java.util.Scanner;

public class  PrintMazePathsWithJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printMazePathsWithJump(1, 1, n, m, "");
    }

    public static void printMazePathsWithJump(int sr, int sc, int dr, int dc, String psf) {
        if (sr == dr && sc == dc) {
            System.out.println(psf);
            return;
        }
        for (int ms = 1; ms <= dc - sc; ms++) {
            printMazePathsWithJump(sr, sc + 1, dr, dc, psf + "h" + ms);
        }
        for (int ms = 1; ms <= dr - sr; ms++) {
            printMazePathsWithJump(sr + ms, sc, dr, dc, psf + "v" + ms);
        }
        for (int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++) {
            printMazePathsWithJump(sr + 1, sc + 1, dr, dc, psf + "d" + ms);
        }
    }
}
