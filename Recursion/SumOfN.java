package Recursion;

public class SumOfN {
    static int sum;
    static int sum(int n,int range)
    {
        if(n>range)
            return sum;
        sum+=n;
        return sum(n+1,range);
    }
    public static void main(String[] args) {
        System.out.println(sum(1,5));
    }
}
