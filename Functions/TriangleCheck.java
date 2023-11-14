package Functions;

import java.util.Scanner;

public class TriangleCheck {
    static void trainglecheck(int a,int b, int c)
    {
        if(a==b && b==c)
            System.out.println("Enter triangle is equilateral ");
        else if (a==b || b==c || a==c)
            System.out.println("Enter triangle is issoscles");
        else
            System.out.println("Enter triangle is scalane");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three sides ");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        trainglecheck(side1,side2,side3);
    }
}
