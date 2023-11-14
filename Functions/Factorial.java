package Functions;

import java.util.Scanner;

public class Factorial {
    static void fact(int num)
    {
        int fact =1;
        for(int i=1;i<=num;i++)
        {
            fact*=i;
        }
        System.out.println(num+ " Factorial is "+fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        fact(num);

    }

}
