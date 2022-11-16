package pepcoding.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class SubSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList arr = gss(str);
        System.out.println(arr);

    }

    public static ArrayList gss(String str) {
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = gss(ros);

        ArrayList<String> mres = new ArrayList();
        for (String res : rres) {
            mres.add("" + res);
            mres.add(ch + res);
        }

        return mres;


    }
}
