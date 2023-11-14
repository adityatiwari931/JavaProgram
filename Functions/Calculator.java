package Functions;

import java.util.Scanner;

public class Calculator {
    static int sum(int a, int b)
    {
        return a+b;
    }
    static int sub(int a, int b)
    {
        return a-b;
    }
    static int mul(int a, int b)
    {
        return a*b;
    }
    static int div(int a, int b)
    {
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two number ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        while (true)
        {
            System.out.println("Press 1 for Addition");
            System.out.println("Press 2 for Subtraction ");
            System.out.println("Press 3 for Multiplication");
            System.out.println("Press 4 for Division");
            System.out.println("Press 5 for exit");
            System.out.println("Enter the operation ");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println(sum(num1, num2));
                    break;
                case 2:
                    System.out.println(sub(num1, num2));
                    break;
                case 3:
                    System.out.println(mul(num1, num2));
                    break;
                case 4:
                    System.out.println(div(num1, num2));
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid operation !");
            }
        }


    }
}
