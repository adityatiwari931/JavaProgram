package Recursion;

public class Prime2 {
    static boolean prime(int n,int div)
    {
        if(div>n/2)
            return true;
        if(n%div==0)
            return false;
        return prime(n,div+1);
    }

    public static void main(String[] args) {
        System.out.println(prime(18,2));
    }
}
