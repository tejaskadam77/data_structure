package pepcoding.stringExamples;

import java.util.Scanner;

public class StringCompression {

    public static String compression1(String str) {
        String s = String.valueOf(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            char cur = str.charAt(i);
            char prev = str.charAt(i - 1);
            if (prev != cur) {
                s = s + cur;
            }
        }
        return s;

    }

    public static String compression2(String str) {
        int count = 1;
        String s = String.valueOf(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            char cur = str.charAt(i);
            char prev = str.charAt(i - 1);
            if (cur == prev) {
                count++;
            } else {
                if (count != 1) {
                    s += count;
                    count = 1;
                }
                s = s + cur;
            }
        }
        if (count > 1) {
            s += count;
            count = 1;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }
}
