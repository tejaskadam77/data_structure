package geeksForGeeks.mathematics;

public class FactorialDemo {
    public static void main(String[] args) {
        System.out.println(iterativeFactorial(4));
        System.out.println(recursiveFactorial(4));
    }

    static int iterativeFactorial(int number)
    {
        int result=1;

                if(number<=0)
                    return result;
        while (number>0)
        {
            result =result*number--;
        }
        return result;
    }
    static int recursiveFactorial(int number)
    {
        if(number==0)
            return 1;
        else
           return number*recursiveFactorial(number - 1);
    }

}


