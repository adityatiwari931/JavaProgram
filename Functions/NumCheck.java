package Functions;

import java.util.Scanner;

public class NumCheck {
    static void numcheck(int x)
    {
        if(x>0)
            System.out.println("Enter number is positive");
        else if(x<0)
            System.out.println("Enter number is negative");
        else
            System.out.println("Enter number is zero");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        numcheck(num);
    }
}
