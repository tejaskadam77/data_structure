package pepcoding.recursion;

public class DisplayArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        displayArr(a, 0);
        System.out.println("++++++++++++++++++++++++");
        displayArrRev(a, 0);

    }

    public static void displayArr(int a[], int index) {
        if (index > a.length - 1)
            return;
        else {
            System.out.println(a[index]);
            displayArr(a, index + 1);
        }
    }
    public static void displayArrRev(int a[], int index) {
        if (index > a.length - 1)
            return;
        else {
            displayArrRev(a, index + 1);
            System.out.println(a[index]);
        }
    }
}
