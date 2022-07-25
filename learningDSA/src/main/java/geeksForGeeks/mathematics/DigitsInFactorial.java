package geeksForGeeks.mathematics;

public class DigitsInFactorial {
    public static void main(String[] args) {
        System.out.println(digitsInFactorial1(5));
    }
    public static int digitsInFactorial1(int N) {

        double digits=0;
        for(int i=1;i<=N;i++){
            digits+=Math.log10(i);
        }
        digits+=1;
        int ans=(int)digits;

        return ans;

    }

    public int digitsInFactorial2(int N) {

        int result = findFactorial(N);
        int countDigits = 0;
        while (result > 0) {
            countDigits++;
            result = result / 10;
        }
        return countDigits;

    }

    public int findFactorial(int n) {
        if (n <= 1)
            return 1;
        else
            return n * findFactorial(n - 1);
    }
}
