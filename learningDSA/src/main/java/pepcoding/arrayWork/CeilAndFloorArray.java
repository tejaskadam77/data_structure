package pepcoding.arrayWork;

import java.util.Scanner;

public class CeilAndFloorArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int []a=new int [n];
        int ceil=0;
        int floor =0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        int data=sc.nextInt();
        int lo=0;
        int hi=a.length-1;

        while(lo<=hi)
        {
            int mid=(lo+hi)/2;
            if(data<a[mid])
            {
                hi=mid-1;
                ceil=a[mid];

            }
            else if (data>a[mid])
            {
                lo=mid+1;
                floor=a[mid];

            }
            else
            {
                ceil=a[mid];
                floor=a[mid];
                break;
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
    }
}
