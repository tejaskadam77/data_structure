package pepcodingPatterns;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int y = 1; y <= n; y++) {
            for (int h = 1; h <= n - y; h++)
                System.out.print("\t");
            System.out.print("*\t");
            System.out.println();
        }
    }
}
