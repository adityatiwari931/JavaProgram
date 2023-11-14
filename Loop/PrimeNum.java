package Loop;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                System.out.println(num+" Is not a prime ");
                break;
            }
            else{
                System.out.println(num+" Is prime");
                break;
            }

        }
    }
}
