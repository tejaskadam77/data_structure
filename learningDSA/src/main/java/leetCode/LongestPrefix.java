package leetCode;

import java.sql.SQLOutput;

public class LongestPrefix {
    public static void main(String[] args) {

        String[] strs = new String[]{"flower", "flow", "flight"};
//        for (int i=0;i<strs.length;i++)
//        {
//            if(strs[i]!= null && strs[i].trim().isEmpty())
//                return "";
//        }
        String pre = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(pre) != 0)
                pre = pre.substring(0,pre.length() - 1);
            if (pre.isEmpty())
                System.out.println(pre);
        }
        System.out.println( "output is---->"+ pre);
    }

}

