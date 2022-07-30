package geeksForGeeks.recursion;

public class RecursionSolution {
    public static void main(String[] args) {
        //recursivePrint(5);
        //System.out.println(recursivePrintSum(1,5,0));
        System.out.println(sumOfDigitsUsingRecursion(2531));
    }
    public static void print(int N) {
        while (N > 0) {
            System.out.println(N--);
        }
    }

    public static void recursivePrint(int N) {
        if (N == 0)
            return;
        recursivePrint(N - 1);
        System.out.println(N);
    }

    public static int recursiveSum(int N) {
        if (N == 1)
            return 1;
        return N + recursiveSum(N - 1);

    }
    public static void recursivePrintSum(int i,int n,int sum) {
        if(i==n)
        {
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        recursivePrintSum(i+1,n,sum);


    }

    public static int sumOfDigitsUsingRecursion(int n) {
        if(n==0)
        return 0;
        else
        {
            return ((n%10)+sumOfDigitsUsingRecursion(n/10));
        }
    }

    public static int sumOfDigits(int n)
    {
        // add your code here
        if(n==0)
            return 0;
        else
            return (n%10)+sumOfDigits(n/10);
    }


}

