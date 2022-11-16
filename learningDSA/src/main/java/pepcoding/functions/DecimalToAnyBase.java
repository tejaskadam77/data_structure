package pepcoding.functions;

import java.util.Scanner;

public class DecimalToAnyBase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(decimalToAnyBase(n, b));
    }

    public static int decimalToAnyBase(int n, int b) {
        int multiplier = 1;
        int ans = 0;
        while (n > 0) {
            int rem = n % b;
            ans = ans + rem * multiplier;
            multiplier = multiplier * 10;
            n = n / b;
        }
        return ans;
    }
}
