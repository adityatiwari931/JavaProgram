package Recursion;

public class Fibonaciii {
    static int fibcal(int n)
    {
        if(n==1)
            return 0;
        if(n==2)
            return 1;

        return fibcal(n-1)+fibcal(n-2);
    }
    static void print(int n)
    {
        if(n<=0)
            return;
        print(n-1);
        System.out.println(fibcal(n)+" ");
    }

    public static void main(String[] args) {
        System.out.println(fibcal(6));
        print(6);
    }

}
