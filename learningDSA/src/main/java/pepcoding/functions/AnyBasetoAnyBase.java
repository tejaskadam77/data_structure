package pepcoding.functions;

import java.util.Scanner;

public class AnyBasetoAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        System.out.println(anyBaseToAnyBase(n, b1, b2));
    }

    public static int anyBaseToAnyBase(int n, int b1, int b2) {
        int decimal = toDecimal(n, b1);
        int result = decimalToAny(decimal, b2);
        return result;
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

    public static int decimalToAny(int n, int b) {
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
