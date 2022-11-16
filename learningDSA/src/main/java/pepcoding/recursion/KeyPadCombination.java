package pepcoding.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class KeyPadCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> words = getKPC(str);
        System.out.println(words);

    }

    static String[] codes = {",;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0)
        {
            ArrayList<String> bres= new ArrayList<>();
            bres.add("");
            return bres;
        }
        char firstChar = str.charAt(0);
        String remString = str.substring(1);
        ArrayList<String> rres = getKPC(remString);

        ArrayList<String> mres = new ArrayList<>();
        String codeForCh = codes[firstChar-'0'];
        for (int i = 0; i < codeForCh.length(); i++) {
            char chCode = codeForCh.charAt(i);
            for (String ex : rres) {
                mres.add(chCode + ex);
            }
        }
        return mres;
    }
}
