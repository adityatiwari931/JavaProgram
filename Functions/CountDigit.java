package Functions;

import java.util.Scanner;

public class CountDigit {
    static void Digitcount(int num)
    {
        int count =0,r=0;

        while(num>0)
        {
            r=num%10;
            count++;
            num/=10;
        }
        System.out.println("Number of Digit are "+count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        Digitcount(num);
    }
}
