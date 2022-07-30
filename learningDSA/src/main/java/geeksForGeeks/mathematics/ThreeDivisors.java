package geeksForGeeks.mathematics;

public class ThreeDivisors {
    public static void main(String[] args) {
        System.out.println(isThree(4));
        System.out.println(isThree(12));
    }

    public static boolean isThree(int n) {
        if (n < 4)
            return false;
        int res = (int) Math.sqrt(n);
        System.out.println(res);
        if (res * res < n) return false;
        for (int i = 2; i * i <= res; i++) {
            if (res % i == 0)
                return false;
        }
        return true;
    }
}