package Recursion;

public class RopeDivisionProb {
    static int count =0;
    static int cutting(int n,int a,int b,int c)
    {
        if(n==0)
        {
            return 0;
        }
        if(n<0)
        {
            return -1;
        }
        int l1 = cutting(n-a,a,b,c);
        int l2 = cutting(n-b,a,b,c);
        int l3 = cutting(n-c,a,b,c);
        int max = Math.max(Math.max(l1,l2),l3);
        return (max>-1?1:0)+max;
    }

    public static void main(String[] args) {
        System.out.println(cutting(7,6,3,8));
    }
}
