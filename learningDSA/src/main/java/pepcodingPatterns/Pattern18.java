package pepcodingPatterns;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int st = n;
        int os = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= os; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                if (i > 1 && i <= n / 2 && j > 1 && j < st)
                    System.out.print("\t");
                else {
                    System.out.print("*\t");
                }
            }
            if (i <= n / 2) {
                st = st - 2;
                os++;
            } else {
                st = st + 2;
                os--;
            }
            System.out.println();

        }
    }
}
