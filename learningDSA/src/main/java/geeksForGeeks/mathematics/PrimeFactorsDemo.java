package geeksForGeeks.mathematics;

public class PrimeFactorsDemo {
    public static void main(String[] args) {
        primeFactors(40);
    }

    static boolean isPrimeOptimisedEfficient(int n) {
        if (n < 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i < n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }

    static void primeFactors(int n) {
        if (n <= 1)
            return;
        int x = n;
//        for (int i = 2; i * i <= n; i++) {
//             if (isPrimeOptimisedEfficient(i)) {
//                while (x % i == 0) {
//                    System.out.println(i);
//                    x = x / i;
//                }
//            }
//        }

        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.println(i);
                n = n / i;
            }
        }
        if (n > 1)
            System.out.println(n);
    }

    static void optimisedPrimeFactors(int n) {
        if (n <= 1)
            return;
        while (n % 2 == 0) {
            System.out.println(2);
            n = n / 2;
        }
        while (n % 3 == 0) {
            System.out.println(2);
            n = n / 3;
        }
        for (int i = 5; i * i < n; i = i + 6) {
            while (n % i == 0) {
                System.out.println(i);
            }
            while (n % (i + 2)==0) {
                System.out.println(i + 2);
            }
        }

        if (n > 3)
            System.out.println(n);

    }
}
