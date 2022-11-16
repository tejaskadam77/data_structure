package pepcoding.stringExamples;

import java.util.ArrayList;

public class RemovePrimeNumbers {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(12);
        al.add(32);
        al.add(157);
        al.add(57);
        al.add(12);
        al.add(8);
        al.add(4);
        al.add(76);
        System.out.println(al);
        solution(al);
        System.out.println(al);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }


    public static void solution(ArrayList<Integer> a) {
        for (int i = a.size() - 1; i >= 0; i--) {
            int n = a.get(i);
            if (isPrime(n)) {
                a.remove(i);
            }
        }
    }
}
