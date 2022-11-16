package pepcoding.arrayWork;

import java.util.Scanner;

public class InverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int val : a) {
            System.out.print(val + "\t");
        }
        System.out.println("\n==========================");

        int inv[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            int val=a[i];
            inv[val]=i;
        }

        for (int val : inv) {
            System.out.print(val + "\t");
        }
    }

}
