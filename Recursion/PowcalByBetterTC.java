package Recursion;

public class PowcalByBetterTC {
    static int cal(int p,int q)
    {
        if(q==0)
        {
            return 1;
        }
        int smallpow = cal(p,q/2);
        if(q%2==0)
        {
            return smallpow*smallpow;
        }
        return p*smallpow*smallpow;

    }

    public static void main(String[] args) {
        System.out.println(cal(5,3));
    }
}
