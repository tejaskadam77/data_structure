package pepcoding;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0)
        {
            System.out.println(n%10);
            n/=10;
        }
    }
}
