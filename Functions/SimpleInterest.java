package Functions;

import java.util.Scanner;

public class SimpleInterest {
    static int simpleInterestCalculate(int p,int r,int t)
    {
        int SI = (p*r*t)/100;
        return SI;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle ");
        int p = sc.nextInt();
        System.out.println("Enter the Rate of Interest");
        int r = sc.nextInt();
        System.out.println("Enter the Time of year ");
        int t = sc.nextInt();
        System.out.println("Simple Interest = "+simpleInterestCalculate(p,r,t)
        );
    }
}
