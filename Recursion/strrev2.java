package Recursion;

public class strrev2 {
    static String rev ="";
    static String revstr(String str,int index)
    {
       if(index<=-1)
       {
           return rev;
       }
       char a = str.charAt(index);
       rev+=a;
       return revstr(str,index-1);
    }

    public static void main(String[] args) {
        String str ="hello world";
        int n = str.length();
        System.out.println(revstr(str,n-1));
    }
}
