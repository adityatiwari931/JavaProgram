package Recursion;

public class fiboaltermethod {
    static int fibcal(int n)
    {
        if(n==0 || n==1)
            return n;

        return fibcal(n-1)+fibcal(n-2);
    }

    public static void main(String[] args) {
        int n=6;
        for(int i =0;i<n;i++)
        System.out.print(fibcal(i)+" ");
    }
}
