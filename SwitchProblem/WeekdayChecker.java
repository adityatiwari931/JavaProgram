package SwitchProblem;

import java.util.Scanner;

public class WeekdayChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day of the week ");
        String dayOfWeek = sc.nextLine().toLowerCase();

        switch (dayOfWeek) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println(dayOfWeek + " is a weekday.");
                break;

            case "saturday":
            case "sunday":
                System.out.println(dayOfWeek + " is a weekend day.");
                break;

            default:
                System.out.println("Invalid input. Please enter a valid day of the week.");
        }
        sc.close();


    }
}
