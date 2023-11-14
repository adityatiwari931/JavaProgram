package Recursion;

public class PrintNto1 {
    static void print(int n)
    {
        //base case
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);//self work
        print(n-1);//recursive work
    }

    public static void main(String[] args) {
        print(5);
    }
}
