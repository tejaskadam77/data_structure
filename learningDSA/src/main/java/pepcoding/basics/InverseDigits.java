package pepcoding.basics;

import java.util.Scanner;

public class InverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem = 0;
        int pos = 1;
        int invertedNumber = 0;
        while (n > 0) {
            rem = n % 10;
            invertedNumber = invertedNumber + pos * (int) Math.pow(10, rem - 1);
            pos++;
            n = n / 10;
        }
        System.out.println(invertedNumber);

    }
}
