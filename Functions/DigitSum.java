package Functions;

import java.util.Scanner;

public class DigitSum {
    static int sumdigit(int num)
    {
        int sum =0,r=0;

        while(num>0)
        {
            r=num%10;
            sum+=r;
            num/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        System.out.println(sumdigit(num));
    }
}
