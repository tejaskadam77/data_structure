package pepcoding.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePaths {
    //sr=source row
    //sc=source column
    //dr=destination row
    //dc=destination column
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> s = getMazePaths(1, 1, n, m);
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();

        if (sc < dc)
            hpaths = getMazePaths(sr, sc + 1, dr, dc);
        if (sr < dr)
            vpaths = getMazePaths(sr + 1, sc, dr, dc);
        ArrayList<String> mres = new ArrayList<>();

        for (String path : hpaths) {
            mres.add("h" + path);
        }
        for (String path : vpaths) {
            mres.add("v" + path);
        }
return mres;
    }
}
