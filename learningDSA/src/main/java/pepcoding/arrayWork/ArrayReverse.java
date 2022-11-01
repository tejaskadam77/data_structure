package pepcoding.arrayWork;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for(int val:a)
        {
           System.out.print(val+"\t");
        }
        System.out.println("==========================");
        for(int i=0,j=a.length-1;i<=a.length/2;i++,j--)
        {
            swap(a,i,j);
        }

//        int b[]=new int[a.length];
//        for(int i=a.length-1,j=0;i>=0;j++,i--)
//        {
//            b[j]=a[i];
//        }
//        int pos=0;
//        while(pos<b.length)
//        {
//            a[pos]=b[pos];
//            pos++;
//        }
        for(int val:a)
       {
          System.out.print(val+"\t");
       }
    }

    public static void swap(int a[],int startIndex,int endIndex)
    {
        int temp=a[startIndex];
        a[startIndex]=a[endIndex];
        a[endIndex]=temp;
    }
}
