package pepcoding.dimensionArray;

import java.util.Scanner;

public class SearchInSorted2DArray {
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
        int x = sc.nextInt();
        int i = 0;
        int j = a[0].length - 1;
        while (i < a.length && j >= 0) {
            if (x == a[i][j]) {
                System.out.println("i and j are i= " + i + "j= " + j);
            } else if (x < a[i][j]) {
                i--;

            } else {
                j++;
            }
        }
        System.out.println("eleement not present");
    }
}
