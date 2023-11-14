package Loop;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num =sc.nextInt();
        int Cnum=num;
        int r=0,rev=0;
        while(num>0)
        {
            r=num%10;
            rev=rev*10+r;
            num/=10;

        }
        System.out.println(rev+" is reverse of "+Cnum);
    }
}
