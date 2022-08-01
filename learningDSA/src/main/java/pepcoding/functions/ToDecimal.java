package pepcoding.functions;

import java.util.Scanner;

public class ToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(toDecimal(n, b));
    }

    public static int toDecimal(int n, int b) {
        int multiplier = 1;
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            ans = ans + rem * multiplier;
            multiplier = multiplier * b;
            n = n / 10;
        }
        return ans;
    }
}
