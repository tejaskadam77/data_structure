package geeksForGeeks.mathematics;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(100123));


    }

    public static int countDigits(int number)
    {int count=0;
       while(number!= 0)
       {
           count++;
           number=number/10;
       }
       return count;
    }

}
