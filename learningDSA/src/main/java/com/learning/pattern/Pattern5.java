package com.learning.pattern;

/*pattern5
       *
     * *
   * * *
 * * * *
 */
public class Pattern5 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=n-i;k++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
