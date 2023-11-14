package Functions;

import java.util.Scanner;

public class salary {

    static double hra(double sal)
    {
        double hra = 0.3*sal;
        return hra;
    }
    static double da(double sal)
    {
        double da = 0.2*sal;
        return da;
    }
    static double ta(double sal)
    {
        double ta = 0.1*sal;
        return ta;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic salary ");
        double basic = sc.nextDouble();
        final int pf = 1400;
        double netSalary = basic+hra(basic)+da(basic)+ta(basic)-pf;
        System.out.println("Net salary = " +netSalary);

    }
}
