package pepcoding.functions;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();

        System.out.println(calculateDigitFrequency(n, d));
    }

    public static int calculateDigitFrequency(int n, int d) {
        int count = 0;
        while (n > 0) {
            if (n % 10 == d)
                count++;
            n = n / 10;
        }
        return count;
    }
}
