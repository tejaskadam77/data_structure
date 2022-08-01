package pepcoding.functions;

import java.util.Scanner;

public class AnyBaseMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        // System.out.println(getProduct(b, n1, n2));
        System.out.println(getProduct(8, 555, 723));
    }

    public static int getProduct(int b, int n1, int n2) {
        int res = 0;
        int singleDigitProduct = 0;
        int multiplier = 1;
        while (n2 > 0) {
            int d2 = n2 % 10;
            n2 = n2 / 10;
            singleDigitProduct = productWithSingleDigit(b, n1, d2);
            res = anyBaseAddition(b,res,singleDigitProduct*multiplier);
            multiplier *= 10;

        }
return res;
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
    public static int productWithSingleDigit(int b, int n1, int d2) {

        int carry = 0;
        int rv = 0;
        int d = 0;
        int multiplier = 1;
        while (n1 > 0 || carry > 0) {
            int d1 = n1 % 10;
            n1 = n1 / 10;
            d = d2 * d1 + carry;
            carry = d / b;
            d = d % b;
            rv = rv + d * multiplier;
            multiplier *= 10;
        }
        return rv;
    }

}
