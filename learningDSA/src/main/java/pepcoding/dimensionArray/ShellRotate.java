package pepcoding.dimensionArray;

import java.util.Scanner;

public class ShellRotate {
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

        int s = sc.nextInt();
        int r = sc.nextInt();
        rotateShell(a, s, r);
        display(a);
    }

    public static int[] fillOnedFromShell(int a[][], int s) {
        int minr = s - 1;
        int maxr = a.length - s;
        int minc = s - 1;
        int maxc = a[0].length - 1;
        int shellSize = 2 * (maxr - minr + maxc - minc);
        int[] oned = new int[shellSize];
        int idx = 0;
//lw
        for (int i = minr, j = minc; i <= maxr; i++) {
            oned[idx] = a[i][j];
            idx++;
        }
        //bw
        for (int i = maxr, j = minc + 1; j <= maxc; j++) {
            oned[idx] = a[i][j];
            idx++;
        }
        //rw
        for (int i = maxr - 1, j = maxc; i >= minr; i--) {
            oned[idx] = a[i][j];
            idx++;
        }
        //tw
        for (int i = minr, j = maxc - 1; j >= minr; j--) {
            oned[idx] = a[i][j];
            idx++;
        }

        return oned;


    }

    public static void fillShellFromOned(int a[][], int s, int[] oned) {
        int minr = s - 1;
        int maxr = a.length - s;
        int minc = s - 1;
        int maxc = a[0].length - 1;
        int idx = 0;
//lw
        for (int i = minr, j = minc; i <= maxr; i++) {
            a[i][j] = oned[idx];
            idx++;
        }
        //bw
        for (int i = maxr, j = minc + 1; j <= maxc; j++) {
            a[i][j] = oned[idx];
            idx++;
        }
        //rw
        for (int i = maxr - 1, j = maxc; i >= minr; i--) {
            a[i][j] = oned[idx];
            idx++;
        }
        //tw
        for (int i = minr, j = maxc - 1; j >= minr; j--) {
            a[i][j] = oned[idx];
            idx++;
        }
    }

    public static void rotateShell(int a[][], int s, int r) {
        int[] oneDArray = fillOnedFromShell(a, s);
        rotate(oneDArray, r);
        fillShellFromOned(a, s, oneDArray);

    }

    public static void rotate(int a[], int k) {
        k = k + a.length;
        k = k % a.length;
        reverse(a, 0, a.length - k - 1);
        reverse(a, a.length - k, a.length - 1);
        reverse(a, 0, a.length - 1);
    }

    public static void reverse(int a[], int si, int li) {
        while (si < li) {
            int temp = a[si];
            a[si] = a[li];
            a[li] = temp;
            si++;
            li--;
        }
    }
}
