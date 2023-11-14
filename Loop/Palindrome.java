package Loop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num =sc.nextInt();
        int r=0,num1=num,rev=0;
        while(num1>0)
        {
            r=num1%10;
            rev=rev*10+r;
            num1/=10;

        }
        if (num==rev)
        {
            System.out.println(num+" is a palindrome Number");
        }
        else
        {
            System.out.println(num+" is not a palindrome Number");
        }
    }
}
