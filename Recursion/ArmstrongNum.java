package Recursion;

public class ArmstrongNum {
    static int count =0;
    static int countdigit(int n)
    {

        if(n==0)
        {
            return count;
        }

        count++;
        return countdigit(n/10);
    }
    static int sum=0;
    static int sum(int p,int n)
    {
        if(n==0)
        {
            return sum;
        }
        sum+=Math.pow((n%10),p);
        return sum(p,n/10);
    }
    static boolean check(int n,int sum)
    {
        if(n==sum)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        int n=24678051;
        int p = countdigit(n);
        int sum =sum(p,n);
        System.out.println(check(n,sum));
    }
}
