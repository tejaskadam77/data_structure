package pepcoding.dimensionArray;

import java.util.Scanner;

public class DiagonalTraversal {
    public static void display(int a[][]) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for n and m");
        int n = sc.nextInt();

        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        display(a);

        for (int g = 0; g < a.length; g++) {
            for (int i = 0, j = g; j < n; i++, j++) {
                System.out.print(a[i][j]);
            }
        }
    }
}
