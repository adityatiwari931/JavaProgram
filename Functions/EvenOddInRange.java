package Functions;

import java.util.Scanner;

public class EvenOddInRange {
    static void Check(int range)
    {
        for (int i =1;i<=range;i++)
        {
            if(i%2==0)
                System.out.println("Even = "+i);
            else
                System.out.println("Odd = "+i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range ");
        int range = sc.nextInt();
        Check(range);
    }
}
