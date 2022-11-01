package pepcoding.recursion;

import java.util.Scanner;

public class PrintKPC {
    static String[] codes = {",;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printKPC(str, "");
    }
    public static void printKPC(String ip,String op)
    {
        if(ip.length()==0)
        {
            System.out.println(op);
            return;
        }
        char firstChar=ip.charAt(0);
        String roq=ip.substring(1);
        String code= codes[firstChar -'0'];
        for(int i=0;i<code.length();i++)
        {
            printKPC(roq,op+code.charAt(i));
        }

    }
}
