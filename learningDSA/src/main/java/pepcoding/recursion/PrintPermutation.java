package pepcoding.recursion;

import java.util.Scanner;

public class PrintPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        printPermutations(s, "");
    }

    public static void printPermutations(String que, String ans) {

        if(que.length()==1)
        {
            System.out.println(ans+que.charAt(0));
            return;
        }
        for (int i = 0; i < que.length(); i++) {
            char ch = que.charAt(i);
            String rmStr = que.substring(0, i) + que.substring(i + 1);
            printPermutations(rmStr, ans + ch);
        }

    }
}
