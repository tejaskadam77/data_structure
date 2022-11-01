package pepcoding.arrayWork;

import java.util.Scanner;

public class SpanOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(findSpan(a));

    }

    public static int findSpan(int a[]) {
        int max, min;
        max = min = a[0];
        for (int j = 0; j < a.length; j++) {
            if (a[j] > max)
                max = a[j];
            if (a[j] < min)
                min = a[j];
        }
        return max - min;
    }
}
