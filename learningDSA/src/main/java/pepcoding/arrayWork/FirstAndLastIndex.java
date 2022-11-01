package pepcoding.arrayWork;

import java.util.Scanner;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];


        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        int fi = -1;
        int data = sc.nextInt();
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (data < a[mid]) {
                high = mid - 1;

            } else if (data > a[mid]) {
                low = mid + 1;
            } else {
                fi = mid;
                high = mid - 1;

            }

        }
        low = 0;
        high = a.length - 1;
        int li = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (data < a[mid]) {
                high = mid - 1;

            } else if (data > a[mid]) {
                low = mid + 1;
            } else {
                li = mid;
                low = mid + 1;

            }

        }


    }
}
