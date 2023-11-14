package SwitchProblem;

import java.util.Scanner;

public class SeasonDeterminer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month name :");
        String month = sc.nextLine().toLowerCase();

        switch (month) {
            case "march":
            case "april":
            case "may":
            case "june":
                System.out.println(month + "Enter month is summer");
                break;

            case "july":
            case "august":
            case "september":
            case "october":
                System.out.println(month + "Enter month is spring");
                break;

            case "November":
            case "december":
            case "january":
            case "february":
                System.out.println(month + "Enter month is winter");
                break;

            default:
                System.out.println("Invalid input. Please enter a valid day of the week.");
        }
        sc.close();


    }
}
