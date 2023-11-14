package Functions;

import java.util.Scanner;

public class Checkvowel {
    static void check(char ch)
    {
        switch(ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case '0':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character ");
        char ch = sc.next().charAt(0);
        check(ch);
    }
}
