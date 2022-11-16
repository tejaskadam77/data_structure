package pepcoding.functions;

import java.util.Scanner;

public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(anyBaseAddition(b, n1, n2));
    }

    public static int anyBaseAddition(int b, int n1, int n2) {
        int carry = 0;
        int ans = 0;
        int d = 0;
        int multiplier = 1;
        while (n1 > 0 || n2 > 0 || carry > 0) {
            int r1 = n1 % 10;
            int r2 = n2 % 10;
            d = (carry + r1 + r2) % b;
            ans = ans + d * multiplier;
            carry = (carry + r1 + r2) / b;
            multiplier = multiplier * 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
        }
        return ans;
    }

    public static int anyBaseSubstraction(int b, int n1, int n2) {
        int c = 0;
        int ans = 0;
        int multiplier = 1;
        while (n2 > 0) {
            int d1 = n1 % 10;
            n1 = n1 / 10;
            int d2 = n2 % 10;
            n2 = n2 / 10;
            int d = 0;
            if (d2 - d1 >= 0) {
                c = 0;
                d = d2 - d1;
            } else {
                c = -1;
                d = d2 + b - d1;
            }
            ans = ans + d * multiplier;
            multiplier *= 10;


        }
        return ans;
    }
}





