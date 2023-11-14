package Recursion;

public class Print {
    static void recur(int n)
    {
       if(n==1)
       {
           System.out.println(n);
           return;
       }
        recur(n-1);
      if(n%2==0)
        System.out.println(n);

    }
    public static void main(String[] args) {
//        int n=1;
        recur(5);
    }
}
