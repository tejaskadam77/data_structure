package geeksForGeeks.mathematics;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(checkPalindrome(111));
    }

    static boolean checkPalindrome(int number) {
        int temp = number;
        int rev = 0;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println(rev);
        if (rev == number)
            return true;
        else
            return false;
    }

}
