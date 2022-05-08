package com.learning.pattern;

public class Pattern11 {
    public static void main(String[] args) {
        int n=5;
        for (int i =1;i<=n;i++)
        {
            for(int j=1;j<=(n-i);j++)
                System.out.print(" ");
           // System.out.println("* * * * * ");
            for(int k=1;k<=n;k++)
            {
                if(i==1||k==1||i==n||k==n)
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
