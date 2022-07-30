package geeksForGeeks.mathematics;

public class TrailingZeroFactorial {

    public static void main(String[] args) {
        System.out.println(recursiveFactorial(20));
        System.out.println(countTrailingZeroes(20));

    }

    static int countTrailingZeroes(int number) {
        int n = 10;
        int result = 0;
        for (int i = 5; i <= n; i = i * 5) {
            result = result + n / i;

        }
        return result;
    }
    static int recursiveFactorial(int number) {
        if (number == 0)
            return 1;
        else
            return number * recursiveFactorial(number - 1);
    }
}

