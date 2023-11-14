package Loop;

import java.util.Scanner;

public class RotatenumUUserInput {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the length");
//        int num
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        System.out.println("Enter the times rotation");
        int rotations = sc.nextInt();
        int countDigit = 0;
        int numCopy = num;
        while (numCopy != 0) {
            numCopy /= 10;
            countDigit++;
        }
        rotations = rotations % countDigit;
        if (rotations < 0) {
            rotations = rotations + countDigit;
        }
        int power = (int) Math.pow(10, rotations);
        int leftPart = num / power;
        int rightPart = num % power;
        int remainingPower = countDigit - rotations;
        power = (int) Math.pow(10, remainingPower);

        int res = rightPart * power + leftPart;

        System.out.println("This is the result :" + res);



    }
}
