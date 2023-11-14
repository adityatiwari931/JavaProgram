package Recursion;

public class PrintKTimesMulti {
    static void multi(int num,int k)
    {
        //BASE CASE
        if(k==1)
        {
            System.out.println(num);
            return ;
        }
        //RECURSIVE CALL
         multi(num,k-1);
        //SELF WORK
        System.out.println(num*k);
    }

    public static void main(String[] args) {
        multi(12,5);

    }
}
