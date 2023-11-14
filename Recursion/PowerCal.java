package Recursion;

public class PowerCal {
    static int ans=1;
    static int power(int p,int q)
    {
        if(q==0)
            return ans;
        ans = ans*p;
        return power(p,q-1);
    }

    public static void main(String[] args) {
        System.out.println(power(2,5));
    }
}
