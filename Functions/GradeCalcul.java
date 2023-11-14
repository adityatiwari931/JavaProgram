package Functions;

import java.util.Scanner;

public class GradeCalcul {
    static double percentage(int p,int c, int m,int h,int e)
    {
        int total = p+c+m+h+e;
        double percent = total*0.2;
        return percent;
    }
    static void grade(double per)
    {
       if(per>=90)
           System.out.println("A");
       else if(per<89 || per>70)
           System.out.println("B");
       else if(per<69 || per>50)
           System.out.println("C");
       else
           System.out.println("D");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 5 subject marks");
        int p = sc.nextInt();
        int c = sc.nextInt();
        int m = sc.nextInt();
        int h = sc.nextInt();
        int e = sc.nextInt();
        grade(percentage(p,c,m,h,e));

    }
}
