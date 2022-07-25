package pepcoding;

import java.util.Scanner;

public class PepCodingMain {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp = n;
        int noOfDigits = 0;
        while (n != 0) {

            n = n / 10;
            noOfDigits++;
        }
        int div = (int) Math.pow(10, noOfDigits - 1);
        while (div > 0) {
            System.out.println(temp / div);
            temp = temp % div;
            div /= 10;
        }
    }
}

