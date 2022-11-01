package pepcoding.stringExamples;

import java.util.Scanner;

public class StringExamples {
    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        StringBuilder b=new StringBuilder("hello");
        b.setCharAt(0,'d');
        System.out.println(b);

//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        //print substrings
//        int len = s.length();
//
//        for (int i = 0; i < len - 1; i++) {
//            for (int j = i + 1; j <= len; j++) {
//                String ss = s.substring(i, j);
//                if(isPalindrome(ss))
//                System.out.println(ss);
//            }
//        }


    }
}
