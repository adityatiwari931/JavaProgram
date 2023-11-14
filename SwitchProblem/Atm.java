package SwitchProblem;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        double balance = 10000.0;
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("Welcome to ATM");
            System.out.println("Press 1 For Check balance");
            System.out.println("Press 2 For Deposit");
            System.out.println("Press 3 For Withdrawal");
            System.out.println("Press 4 For Exit");
            System.out.println("Enter the OPERATION");
            int choice =sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("your balance --"+balance);
                    break;
                case 2:
                    System.out.println("Enter the amount to be deposit");
                    double depo =sc.nextDouble();
                    System.out.println("Amount deposit successfully");
                    balance+=depo;
                    System.out.println("Your current Balance --"+balance);
                    break;
                case 3:
                    System.out.println("Enter the amount to be Withdraw");
                    double withdraw = sc.nextDouble();
                    if(withdraw>0 && withdraw<=balance)
                    {
                        System.out.println("Withdraw successful");
                        balance-=withdraw;
                        System.out.println("Your current balance is "+balance);
                    }
                    else
                    {
                        System.out.println("insufficient balance");
                    }
                    break;
                case 4:
                    System.out.println("Thanks for using , hope we serve well !");
                    System.exit(0);
                default:
                    System.out.println("OPERATION not valid !");
            }
            sc.close();

        }


    }
}
