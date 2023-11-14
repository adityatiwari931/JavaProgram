package Functions;

import java.util.Scanner;

public class LeapYear {
    static void CheckLeap(int year)
    {
        if(year%4==0 && year%100!=0)
            System.out.println("Leap year");
        else if (year%400==0 ) {
            System.out.println("Leap year");
        }
        else
            System.out.println("not a leap year");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year ");
        int Year = sc.nextInt();
        CheckLeap(Year);

    }

}
