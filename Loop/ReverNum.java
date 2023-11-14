package Loop;

import java.util.Scanner;

public class ReverNum {
    public static int reverse(int num){
        int rev=0;
        int r=0;
        while(num>0)
        {
            r=num%10;
            rev=rev*10+r;
            num=num/10;
        }
        return rev;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number ");
        int num = sc.nextInt();
        System.out.println("Original numbeer = "+num);
        System.out.println("reverse of number = "+reverse(num));

    }
}
