package pepcoding.arrayWork;

import java.util.Scanner;

public class SubArraySol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int size = a.length - 1;
        for (int i = 0; i <= size; i++) {
            for (int j = i; j <= size; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(a[k]);
                }
                System.out.println(" ");
            }
        }

    }
}
