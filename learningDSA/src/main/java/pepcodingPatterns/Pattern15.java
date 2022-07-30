package pepcodingPatterns;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int os = n / 2;
        int st = 1;
        int count=1;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= os; j++) {
                System.out.print("\t");
            }
            int cval=count;
            for (int j = 1; j <= st; j++) {
                System.out.print(cval+"\t");
                if(j<=st/2)
                {
                    cval++;
                }
                else
                    cval--;
            }
            if (i <= n / 2) {
                os--;
                st += 2;
                count++;
            } else {
                os++;
                st -= 2;
                count--;
            }
            System.out.println();


        }
    }
}
