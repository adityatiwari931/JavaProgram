package Recursion;

public class StrRever {
   static String rev = "";
   static String rever(String s,int n)
   {
       if(n<=-1)
       {
           return rev;
       }
       char a = s.charAt(n);
       rev+=a;
       return rever(s,n-1);
   }

    public static void main(String[] args) {
        String s = "Hello world";
        System.out.println(rever(s,s.length()-1));
    }
}
