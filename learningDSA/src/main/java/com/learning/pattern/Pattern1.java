package com.learning.pattern;

/*
pattern 1
 ****   first row 4 stars
 ****   second row 4 stars
 ****
 ****
 */
public class Pattern1 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
