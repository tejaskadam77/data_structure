package pepcoding.recursion;

import java.util.Scanner;

public class PrintEncoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        printEncoding(s, "");
    }

    public static void printEncoding(String que, String ans) {
        if (que.length() == 0) {
            System.out.println(ans);
            return;
        } else if (que.length() == 1) {
            char ch = que.charAt(0);
            if (ch == '0') {
                return;
            } else {
                int chv = ch - '0';
                char code = (char) ('a' + chv - 1);
                System.out.println(ans + code);
            }
        } else {
            char ch = que.charAt(0);
            String remS = que.substring(1);

            if (ch == '0') {
                return;
            } else {
                int chv = ch - '0';
                char code = (char) ('a' + chv - 1);
                printEncoding(remS,ans+code);

            }
            String ch2=que.substring(0,2);
            String roq=que.substring(2);
            int chv2= Integer.parseInt(ch2);
            if(chv2<=26)
            {
              char code = (char)('a'+chv2 - 1);
              printEncoding(roq,ans+code);
            }

        }
    }
}
