package Functions;

import java.util.Scanner;

public class Armastrong {
    static int count(int num){
        int count = 0;
        while (num>0)
        {
            num/=10;
            count++;
        }
        return count;
    }
    static int Totalsum(double count, int num)
    {
        int sum =0;
        double r=0;
        while(num>0)
        {
            r=num%10;
            sum+=Math.pow(r,count);
            num/=10;
        }
        return sum;
    }

    static void checkArm(int num, int sum)
    {
       if(num==sum)
       {
           System.out.println("Armstrong number ");
       }
       else
       {
           System.out.println("Not a Armstrong Number ");
       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int copy =num;
        int count = count(num);
        int sum = Totalsum(count,num);
        checkArm(copy,sum);

    }
}
