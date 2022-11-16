package pepcoding.arrayWork;

import java.util.Scanner;

public class RotateArray {
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
        System.out.println("provide k");
        int k=sc.nextInt();
        rotate(a,k);
        for(int val:a)
        {
            System.out.print(val+"\t");
        }
    }
    public static void rotate(int[] nums, int k) {
       int pos=1;
        while(pos<=k){

            int temp=nums[nums.length-1];
            for(int i=nums.length-1;i>0;i--)
            {
                nums[i]=nums[i-1];
            }
            nums[0]=temp;
            pos++;

        }

        //calculate K
//        k=k+nums.length;
//        k=k% nums.length;
//        //rotate part1
//        reverse(nums,0,nums.length-k-1);
//        reverse(nums,nums.length-k,nums.length-1);
//        reverse(nums,0,nums.length-1);
//rotate part2
  //rotate entire array
    }

    public static void reverse(int a[],int startIndex,int endIndex)
    {
        while(startIndex<endIndex)
        {
            int temp=a[startIndex];
            a[startIndex]=a[endIndex];
            a[endIndex]=temp;
            startIndex++;
            endIndex--;

        }

    }

}
