package com.learning.pattern;

//butterfly pattern
public class Pattern10 {
    public static void main(String[] args) {

        int n=4;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            int z=(n-i)*2;
            for (int k=1;k<=z;k++)
            {
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            int z=(n-i)*2;
            for (int k=1;k<=z;k++)
            {
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
