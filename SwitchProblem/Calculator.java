package SwitchProblem;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1 = ");
        int a = sc.nextInt();
        System.out.println("Enter the num2 = ");
        int b = sc.nextInt();
        System.out.println("Press 1 For ADDITION");
        System.out.println("Press 2 For SUBSTRACTION");
        System.out.println("Press 3 For MULTIPLY");
        System.out.println("Press 4 For DIVISION");
        System.out.println("Enter the OPERATION");
        int op = sc.nextInt();
        switch (op)
        {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("Enter the valid OPERATION");
        }
        sc.close();


    }
}
