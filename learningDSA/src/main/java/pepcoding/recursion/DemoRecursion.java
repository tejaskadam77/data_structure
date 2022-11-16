package pepcoding.recursion;

import java.util.Scanner;

public class DemoRecursion {

    public static void recursionDecreasing(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        recursionDecreasing(n - 1);

    }

    public static void recursionIncreasing(int n) {
        if (n == 0)
            return;
        else {
            recursionIncreasing(n - 1);
            System.out.println(n);
        }

    }

    public static void pdi(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        pdi(n - 1);
        System.out.println(n);
    }

    public static int recursivePower(int x, int n) {
        if (n == 0)
            return 1;
        return x * recursivePower(x, n - 1);

    }

    public static int recursivePowerLog(int x, int n) {
        if (n == 0)
            return 1;
        int res;
        res = recursivePowerLog(x, n / 2) * recursivePowerLog(x, n / 2);
        if (n % 2 == 1)
            res = x * res;
        return x * recursivePower(x, n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        recursionIncreasing(n);
//        System.out.println("+++++++++++++++");
//       recursionDecreasing(n);
        pdi(n);
        System.out.println(recursivePower(5, 3));
    }
}
