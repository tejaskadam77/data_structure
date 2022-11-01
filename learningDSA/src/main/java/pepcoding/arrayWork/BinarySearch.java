package pepcoding.arrayWork;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter no to found");
        int data = sc.nextInt();
       int res=0;
        res=search(a,data,0,a.length-1);
        System.out.println(res);

    }

    public static int search(int a[], int data,int startIndex, int lastIndex) {
        while (startIndex < lastIndex) {
            int mid = (startIndex + lastIndex) / 2;
            if (a[mid] == data)
                return mid;
            if (data< a[mid]) {
                lastIndex = mid - 1;
            } else {
                startIndex = mid + 1;
            }
        }

        return - 1;

    }

}
