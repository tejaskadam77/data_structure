package pepcoding;

import java.util.Scanner;

public class InverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem = 0;
        int count = 1;
        int invertedNumber = 0;
        while (n > 0) {
            rem = n % 10;
            invertedNumber = invertedNumber + count * (int) Math.pow(10, rem - 1);
            count++;
            n = n / 10;
        }
        System.out.println(invertedNumber);

    }
}
