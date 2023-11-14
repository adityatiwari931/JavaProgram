package Functions;

import java.util.Scanner;

public class Swap {
    static void fun1(int a, int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap num1 " +a);
        System.out.println("After swap num2 "+b);
    }
    static void fun2(int a,int b)
    {
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("After swap num1 " +a);
        System.out.println("After swap num2 "+b);
    }
    static void fun3(int a,int b)
    {
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swap num1 " +a);
        System.out.println("After swap num2 "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int num2 = sc.nextInt();
        fun1(num1,num2);
        fun2(num1,num2);

    }
}
