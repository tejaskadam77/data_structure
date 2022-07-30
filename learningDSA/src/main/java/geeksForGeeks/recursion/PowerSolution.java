package geeksForGeeks.recursion;

public class PowerSolution {
    public static void main(String[] args) {
        calculatePowerIterative(2, 3);
        System.out.println(calculatePowerRecursive(2, 4));
        System.out.println(calculatePowerRecursiveOptimised(2,4));
    }

    public static void calculatePowerIterative(int x, int n) {
        if (n == 0)
            System.out.println(1);
        else {
            int result = 1;
            for (int i = 1; i <=n; i++) {
                result = result * x;
            }
            System.out.println(result);
        }

    }

    public static int calculatePowerRecursive(int x, int n) {
        if (n == 0)
            return 1;
        if (x == 0)
            return x;
        return x * calculatePowerRecursive(x, n - 1);
    }


    public static int calculatePowerRecursiveOptimised(int x, int n) {
        if (n == 0)
            return 1;
        if (x == 0)
            return x;
        if (n % 2 == 0) {
            return calculatePowerRecursiveOptimised(x,n / 2) * calculatePowerRecursiveOptimised(x,n / 2);
        } else {
            return x * calculatePowerRecursiveOptimised(x,n / 2) * calculatePowerRecursiveOptimised(x,n / 2);
        }
    }
}
