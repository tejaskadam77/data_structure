package pepcoding;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int a=0;int b=1;
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int c;
        for(int i=1;i<=n;i++)
        {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
