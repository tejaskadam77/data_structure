package pepcoding.stringExamples;

import java.util.Scanner;

public class permutationsOfString {
    public static int factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    public static void solution(String str) {
        int n = str.length();
        int f = factorial(n);
        for (int i = 0; i < f; i++) {
            int temp = i;
            StringBuilder sb = new StringBuilder(str);
            for (int div = n; div >= 1; div--) {
                int q = temp / div;
                int r = temp % div;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp = q;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        solution(s);
    }
}
