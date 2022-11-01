package pepcoding.arrayWork;

import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter element to find index");
        int n=sc.nextInt();
        System.out.println(findIndex(a, n));
    }

    public static int findIndex(int a[], int n) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n)
                return i;
        }
        return -1;
    }
}
