package pepcoding.recursion;

public class MaxOfArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3};

        System.out.println("++++++++++++++++++++++++");
        System.out.println(maxOfArr(a, 0));
    }

    public static int maxOfArr(int[] arr, int idx) {
        if (idx == arr.length - 1)
            return arr[idx];
        int misa = maxOfArr(arr, idx + 1);
        if (misa > arr[idx]) {
            return misa;
        } else
            return arr[idx];
    }
}
