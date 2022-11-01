package pepcoding.dimensionArray;

import java.util.Scanner;

public class SaddlePoint {
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
        for (int i = 0; i < a.length; i++) {
            int svj = 0;
            for (int j = 1; j < a[0].length; j++) {
                if (a[i][j] < a[i][svj]) {
                    svj = j;
                }
            }
            boolean flag = true;
            for (int k = 0; k < a.length; k++) {
                if (a[k][svj] > a[i][svj]) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.println(a[i][svj]);
                return;
            }
        }
        System.out.println("Invalid Input");
    }

}
