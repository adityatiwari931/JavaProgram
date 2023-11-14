package Recursion;

public class reverse {
    static int rev=0;
    static int rever(int n)
    {
        if(n<=0)
        {
            return rev;
        }
        int s=n%10;
        rev = rev*10+s;
        return rever(n/10);

    }

    public static void main(String[] args) {
        System.out.println(rever(1234));
    }
}
