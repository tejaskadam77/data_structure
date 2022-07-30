package geeksForGeeks.mathematics;

public class GCD {
    public static void main(String[] args) {
        //System.out.println(calculateGCD(15, 45));
        //System.out.println(euclidGCD(15, 45));
        System.out.println(recursiveEuclid(15, 45));
    }

    static int calculateGCD(int num1, int num2) {
        int result = Math.min(num1, num2);

        for (; result >= 1; result--) {
            if (num1 % result == 0 && num2 % result == 0)
                break;
        }
        return result;

    }

    static int euclidGCD(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        return num1;

    }

    static int recursiveEuclid(int a, int b) {
        if (b == 0)
            return a;
        else {
            return recursiveEuclid(b, a % b);
        }
    }

}
