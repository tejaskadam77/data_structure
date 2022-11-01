package pepcoding.recursion;

import java.util.Scanner;

public class PrintStairPaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStairpath(n, "");
    }

    public static void printStairpath(int n, String ans) {
        if (n < 0) {
            return;
        }
        if (n == 0) {
            System.out.println(ans);
            return;
        }
        printStairpath(n - 1, ans + "1");
        printStairpath(n - 2, ans + "2");
        printStairpath(n - 3, ans + "3");
    }
}
