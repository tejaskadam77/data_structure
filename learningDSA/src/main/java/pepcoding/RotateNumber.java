package pepcoding;

import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int j=0;
        int noOfDigits=0;
        int temp=n;
        while(temp>0)
        {
            temp/=10;
            noOfDigits++;
        }
        k=k%noOfDigits;
        if (k < 0)
        {
            k=k+noOfDigits;
        }

        n=(n%(int)Math.pow(10,k))*((int)Math.pow(10,noOfDigits-k))+(n/(int)Math.pow(10,k) );
        System.out.println(n);

    }
}
