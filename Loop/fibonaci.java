package Loop;

import java.util.Scanner;

public class fibonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range ");
        int n = sc.nextInt();
        int fib[]=new int[n];
        fib[0]=0;
        fib[1]=1;
        for(int i=2;i<n;i++)
        {
            fib[i]=fib[i-1]+fib[i-2];
        }
        for(int i=0;i<fib.length;i++)
        {
            if(fib[i]<=n)
            System.out.print(fib[i]+" ");
        }
    }

}
