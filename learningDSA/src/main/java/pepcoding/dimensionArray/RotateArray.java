package pepcoding.dimensionArray;

import java.util.Scanner;

public class RotateArray {
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
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        display(a);
//display


        //make transpose

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        display(a);
//rev colums
        for (int i = 0; i < a.length - 1; i++) {
            int li = 0;
            int ri = a[i].length - 1;
            while (li < ri) {
                int temp = a[i][li];
                a[i][li] = a[i][ri];
                a[i][ri] = temp;
                li++;
                ri--;

            }
        }
        display(a);

    }
}
