package pepcoding.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePathsWithJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(getMazePaths(1, 1, n, m));
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        if (sr == dr && sc == dc) {
            ArrayList<String> bl = new ArrayList<>();
            bl.add("");
            return bl;
        }
        ArrayList<String> paths = new ArrayList();
        for (int ms = 1; ms <= dc - sc; ms++) {
            ArrayList<String> hpaths = getMazePaths(sr, sc + ms, dr, dc);
            for (String hpath : hpaths) {
                paths.add("h" + ms + hpath);
            }
        }
        for (int ms = 1; ms <= dr - sr; ms++) {
            ArrayList<String> vpaths = getMazePaths(sr + ms, sc, dr, dc);
            for (String vpath : vpaths) {
                paths.add("v" + ms + vpath);
            }
        }
        for (int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++) {
            ArrayList<String> dpaths = getMazePaths(sr + ms, sc + ms, dr, dc);
            for (String dpath : dpaths) {
                paths.add("d" + ms + dpath);
            }
        }
        return paths;
    }
}
