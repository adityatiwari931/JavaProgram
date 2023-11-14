package Functions;

import java.util.Scanner;

public class SumOfSeries2 {
    static int sumRange(int range)
    {
        int sum =0;
        for(int i = 1;i<=range;i++)
        {
            sum+=i*10+2;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int range = sc.nextInt();
        System.out.println(sumRange(range));
    }
}
