package geeksForGeeks.mathematics;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(213));
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else if (n == 2)
            return true;
        else {
            for (int i = 2; i < n; i++)
                if (n % i == 0)
                    return false;
        }
        return true;
    }

    static boolean isPrimeEfficient(int n) {
        if (n < 2) {
            return false;
        } else if (n == 2)
            return true;
        else {
            for (int i = 2; i * i < n; i++)
                if (n % i == 0)
                    return false;
        }
        return true;
    }

    static boolean isPrimeOptimisedEfficient(int n) {
        if (n < 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0||n % 3 == 0)
        return false;
        for (int i = 5; i * i < n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }

}
