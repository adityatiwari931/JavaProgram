package Recursion;

public class SumOfDigit {
    static int sum =0;
    static int Sumdigit(int n)
    {
        if(n==0)
        {
            return sum;
        }
        sum=sum+(n%10);
        return Sumdigit(n/10);
    }

    public static void main(String[] args) {
        System.out.println(Sumdigit(1234));
    }
}
