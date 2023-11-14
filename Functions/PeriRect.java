package Functions;

import java.util.Scanner;

public class PeriRect {
    static  int PeriCalculate(int l, int b)
    {
        int peri = 2*(l+b);
        return peri;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth ");
        int breadth = sc.nextInt();
        System.out.println("Perimeter of the rectangle = "+PeriCalculate(length,breadth));
    }
}
