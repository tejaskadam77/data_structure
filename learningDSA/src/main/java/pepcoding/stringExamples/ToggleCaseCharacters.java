package pepcoding.stringExamples;

import java.util.Scanner;

public class ToggleCaseCharacters {

    public static String toggleCase(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                char uch = (char) ('A' + ch - 'a');
                sb.setCharAt(i, uch);
            } else {
                char lch = (char) (ch + 'a' - 'A');
                sb.setCharAt(i, lch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(toggleCase(s));
    }
}
