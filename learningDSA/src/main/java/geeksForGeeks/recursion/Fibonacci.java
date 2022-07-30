package geeksForGeeks.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(iterativeFibonacci(12));
        printFibonacci(0,1,5);
    }
    public static int iterativeFibonacci(int n) {
        if (n <=1)
            return 1;
        int prevprevNumber = 0;
        int prevNumber = 1;
        int currentNumber = 0;
        for (int i = 2; i <= n; i++) {
            currentNumber = prevprevNumber + prevNumber;
            prevprevNumber = prevNumber;
            prevNumber = currentNumber;
        }
        return currentNumber;
    }

    public static int fibonacciRecursive(int n)
    {
        if(n<=1)
            return 1;
        return fibonacciRecursive(n-1)+fibonacciRecursive(n-2);
    }
    public static void printFibonacci(int a,int b,int n)
    {
        if(n==0)
            return ;
        int c=a+b;
        System.out.println(c);
        printFibonacci(b,c,n-1);
    }

}
