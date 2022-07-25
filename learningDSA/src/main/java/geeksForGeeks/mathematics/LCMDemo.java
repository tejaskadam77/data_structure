package geeksForGeeks.mathematics;

public class LCMDemo {
    public static void main(String[] args) {
        System.out.println(getLCM(12,15));
    }
    static int getLCM(int a,int b)
    {
        int gcdResult=recursiveEuclid(a,b);
        return (a*b)/gcdResult;// a*b= gcd(a,b)*lcm(a,b);
    }
    static int recursiveEuclid(int a,int b)
    {
        if(b==0)
            return a;
        else
        {
            return recursiveEuclid(b, a%b);
        }
    }
}
