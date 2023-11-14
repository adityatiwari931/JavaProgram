package Functions;

import java.util.Scanner;

public class UpperToLowerCase {
    static void convert(String n)
    {
        String s ="";
        for(int i=0;i<n.length();i++)
        {
            if(Character.isLowerCase(n.charAt(i)))
            {
                s += Character.toUpperCase(n.charAt(i));
            }

            else
            {
                s+=Character.toLowerCase(n.charAt(i));
            }


        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String s = sc.next();
        convert(s);

    }
}
