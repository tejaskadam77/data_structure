package pepcoding.stringExamples;

import java.util.Scanner;

public class AsciiDiffernce {
    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            char cur = str.charAt(i);
            char prev = str.charAt(i - 1);
            int gap = cur - prev;
            sb.append(gap);
            sb.append(cur);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
