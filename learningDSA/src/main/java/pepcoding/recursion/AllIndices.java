package pepcoding.recursion;

import java.util.Scanner;

public class AllIndices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
        }
        System.out.println("Enter data to find first index");
        int data = sc.nextInt();

    }

    public static int[] allIndices(int[] a, int data, int idx, int fsf) {
        if (a.length == idx) {
            return new int[fsf];
        }
        if (a[idx] == data) {
            int arr[] = allIndices(a, data, idx + 1, fsf + 1);
            arr[fsf] = idx;
            return arr;

        } else {
            int arr[] = allIndices(a, data, idx + 1, fsf);
            return arr;
        }

    }
}
