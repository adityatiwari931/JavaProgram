package Loop;

import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        boolean f=false;
        for(int i=0;i<s1.length();i++)
        {
            f=false;
            for(int j=0;j<s2.length();j++)
            {
                if(s1.charAt(i)==s2.charAt(j))//"lewl"   "well"
                {
                    f=true;
                    break;
                }

            }
//                f=false;
        }
        System.out.println(f);

    }
}
