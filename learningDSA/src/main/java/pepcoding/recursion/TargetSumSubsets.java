package pepcoding.recursion;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TargetSumSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("please enter a target sum");
        int target = sc.nextInt();
        printTargetSubset(a,0,"",0,target);
    }

    public static void printTargetSubset(int a[],int idx,String subset,int sos,int target)
    {
        if(idx==a.length || sos>target)
        {
            if(sos==target) {
                System.out.println(subset);
            }
            return;
        }
        printTargetSubset(a,idx+1,subset+a[idx]+",",sos+a[idx],target);
        printTargetSubset(a,idx+1,subset,sos,target);

    }
}
