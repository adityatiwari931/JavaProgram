package Recursion;

public class evn2 {
 static void digipr(int n)
 {
     if(n==0)
     {
        return;
     }
     digipr(n/10);
     if(n%2==0)
     System.out.println(n%10);
 }

    public static void main(String[] args) {
        digipr(1234);
    }
}
