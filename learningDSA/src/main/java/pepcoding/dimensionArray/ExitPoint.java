package pepcoding.dimensionArray;

import java.util.Scanner;

public class ExitPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for r1 and c1");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int a[][] = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int dir = 0;//0=east,1=south,2=west,3=north;
        int i = 0;
        int j = 0;
        while (true) {
            dir = dir + a[i][j];
            if (dir == 0) {
                j++;
            } else if (dir == 1) {
                i++;
            } else if (dir == 2) {
                j--;
            } else {
                i--;
            }
            if (i < 0) {
                i++;
                break;
            } else if (j < 0) {
                j++;
                break;
            } else if (i == a.length) {
                i--;
                break;
            } else if (j == a[0].length) {
                j--;
                break;
            }
        }
    }
}
