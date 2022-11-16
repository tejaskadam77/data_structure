package pepcoding.recursion;

import java.util.Scanner;

public class ArraYFirstIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter data to find first index");
        int data = sc.nextInt();
        System.out.println(calculateFirstIndex(a, 0, data));
    }

    public static int calculateFirstIndex(int a[], int idx, int data) {
        if (idx == a.length)
            return -1;
        if (a[idx] == data) {
            return idx;
        } else {
            int fi = calculateFirstIndex(a, idx + 1, data);
            return fi;
        }

    }

    public static int calculateLastIndex(int a[], int idx, int data) {
        if (idx == a.length)
            return -1;
        int li = calculateLastIndex(a, idx + 1, data);
        if (li == -1) {
            if (a[idx] == data)
                return idx;
            else
                return -1;
        }
        else return li;
    }
}
