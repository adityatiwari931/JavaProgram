package Functions;

import java.util.Scanner;

public class SumOfN {
    static int sum(int n)
    {
    int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
            return sum;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range ");
        int n = sc.nextInt();
        System.out.println(sum(n));

    }
}
