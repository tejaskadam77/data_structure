package geeksForGeeks.mathematics;

public class ComputePower {
    public static void main(String[] args) {
        System.out.println(computePower(2, 3));
    }

    static int computePower(int x, int n) {
        int result = 1;
        while (n >= 1) {
            result = result * x;
            n--;
        }
        return result;

    }

}
