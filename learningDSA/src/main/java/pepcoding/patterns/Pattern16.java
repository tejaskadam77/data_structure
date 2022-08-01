package pepcoding.patterns;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = 2 * n - 3;
        int st = 1;
        for (int i = 1; i <= n; i++) {
            int val = 1;
            for (int j = 1; j <= st; j++) {
                System.out.print(val++ + "\t");
            }
            for (int j = 1; j <= sp; j++)
                System.out.print("\t");

            if (i == n) {
                val--;
                st--;
            }
            for (int j = 1; j <= st; j++) {
                val--;
                System.out.print(val + "\t");
            }
            st++;
            sp = sp - 2;
            System.out.println();
        }
    }
}
