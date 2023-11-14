package Functions;

import java.util.Scanner;

public class EvenOdd {
    static void EvenOddCheck(int num)
    {
        if(num%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        EvenOddCheck(num);

    }
}
