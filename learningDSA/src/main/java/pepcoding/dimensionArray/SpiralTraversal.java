package pepcoding.dimensionArray;

import java.util.Scanner;

public class SpiralTraversal {
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
        int minr = 0;
        int minc = 0;
        int maxr = r1 - 1;
        int maxc = c1 - 1;
        int count = 0;
        int totalNoOFElements = r1 * c1;


        while (count < totalNoOFElements) {
            //left wall
            for (int i = minr, j = minc; i <= maxr && count < totalNoOFElements; i++) {
                System.out.print(a[i][j]);
                count++;
            }
            minc++;
            //bottom wall
            for (int j = minc, i = maxr; j <= maxc && count < totalNoOFElements; j++) {
                System.out.print(a[i][j]);
                count++;
            }
            maxr--;
            //right wall
            for (int j = maxc, i = maxr; i >= minr && count < totalNoOFElements; i--) {
                System.out.print(a[i][j]);
                count++;
            }
            maxc--;
            //up wall
            for (int j = maxc, i = minr; j >= minc && count < totalNoOFElements; j--) {
                System.out.println(a[i][j]);

                count++;
            }
            minr++;

        }

    }
}
