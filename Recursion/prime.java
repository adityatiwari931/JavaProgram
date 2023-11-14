package Recursion;

import java.util.Scanner;

public class prime {
    static boolean prime(int n,int div)
    {
        if(div>n/2)
            return true;
        if(n%div == 0)
            return false;
        return prime(n,div+1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        System.out.println(prime(n,2));
        sc.close();

    }
}
