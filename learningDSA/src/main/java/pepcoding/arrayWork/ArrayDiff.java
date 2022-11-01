package pepcoding.arrayWork;

import java.util.Scanner;

public class ArrayDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int a1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int a2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = sc.nextInt();
        }
        int[] diff = new int[n2];
        int c = 0;
        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = diff.length - 1;
        while (j >= 0) {
            int d = 0;
            int a1Val = i >= 0 ? a1[i] : 0;
            if (a2[j] + c >= a1Val) {
                d = a2[j] + c - a1Val;
                c = 0;
            } else {
                d = a2[j] + c + 10 - a1Val;
                c = -1;
            }
            diff[k] = d;
            k--;
            i--;
            j--;

        }
        int count = 0;
        while (diff[count] == 0) {
            count++;
        }
        while (count < diff.length) {
            System.out.println(diff[count++]);
        }


    }
}
