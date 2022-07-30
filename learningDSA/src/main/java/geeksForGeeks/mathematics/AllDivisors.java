package geeksForGeeks.mathematics;

public class AllDivisors {
    public static void main(String[] args) {
        efficientPrintDivisors(30);
        System.out.println("===============================");
        efficientSortedPrintDivisors(30);
    }

    static void printAllDivisors(int n) {
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                System.out.println(i);
        }
        System.out.println(n);
    }

    static void efficientPrintDivisors(int n) {
        for (int i = 1; i * i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                if (i != n / i)
                    System.out.println(n / i);
            }
        }
    }

    static void efficientSortedPrintDivisors(int n) {
        int i;
        for (i = 1; i * i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        for (; i >= 1; i--) {
            if (n % i == 0) {
                int r = n / i;
                System.out.println(r);
            }

        }
    }


}
