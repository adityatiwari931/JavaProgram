package Loop;

import java.util.Scanner;

public class Charcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int i=0;
        while(i!=s.length())
        {
            i++;
        }
        System.out.println(i);
    }
}
