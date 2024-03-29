package pepcoding.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class StairPaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);

    }

    public static ArrayList<String> getStairPaths(int n) {
        if (n == 0) {
            ArrayList blist = new ArrayList<>();
            blist.add("");
            return blist;
        }
        if (n < 0) {
            ArrayList blist = new ArrayList<>();
            return blist;
        }
        ArrayList<String> paths1 = getStairPaths(n - 1);
        ArrayList<String> paths2 = getStairPaths(n - 2);
        ArrayList<String> paths3 = getStairPaths(n - 3);
        ArrayList<String> paths = new ArrayList<>();
        for (String path : paths1) {
            paths.add(1 + path);
        }
        for (String path : paths1) {
            paths.add(2 + path);
        }
        for (String path : paths1) {
            paths.add(3 + path);
        }
        return paths;

    }
}
