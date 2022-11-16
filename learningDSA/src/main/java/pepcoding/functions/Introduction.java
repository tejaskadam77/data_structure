package pepcoding.functions;

import java.util.Scanner;

public class Introduction {
    public static int factorial(int n) {
        int fact = 1;
        while (n >= 1) {
            fact = fact * n;
            n--;
        }
        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(calculatePermutation(n, r));
    }

    public static int calculatePermutation(int n, int r) {
        return (factorial(n) / factorial(n - r));
    }
}
