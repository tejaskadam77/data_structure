package geeksForGeeks.mathematics;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        sieve(10);
    }

    static void sieve(int n) {
        boolean isPrime[] = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * 2; j < n; j=j+i) {
                    isPrime[j] = false;
                }
            }

        }
        for (int z = 2; z < n; z++) {
            if (isPrime[z])
                System.out.println(z);
        }

    }

}
