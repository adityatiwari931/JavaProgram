package Loop;

import java.util.Scanner;

public class EachCharcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count =1;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    count++;
                }
            }
            System.out.println(s.charAt(i)+" present "+count+" times ");
        }
    }

}
