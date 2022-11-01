package pepcoding.dimensionArray;

import java.util.Scanner;

public class WaveTraversal {
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
        for (int j = 0; j < c1; j++) {
            if (j % 2 == 0)
                for (int i = 0; i < r1; i++) {
                    System.out.print(a[i][j]+"\t");
                }
            else {
                for (int i = r1 - 1; i >= 0; i--) {
                    System.out.print(a[i][j]+"\t");
                }
            }
        }


    }
}
