package Recursion;

public class Reverse2 {
    static int rev =0;
    static int   rever(int n)
    {
        if(n==0)
        {
            return rev;
        }
        rev = rev*10+(n%10);
        return rever(n/10);
//        System.out.println(rev);
    }

    public static void main(String[] args) {
        System.out.println(rever(1234));
    }
}
