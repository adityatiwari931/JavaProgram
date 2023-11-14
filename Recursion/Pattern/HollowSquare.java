package Recursion.Pattern;

public class HollowSquare {
    static void printstar(int n)
    {
        if(n==0)
            return;
        System.out.print("*");
        printstar(n-1);
    }
    static void hollowsquare(int row,int col)
    {
        if(row==0)
        {
            return;
        }
        hollowsquare(row-1,col);
        if(col==1 ||col==row)
        printstar(col);
        else
        {

        }
        System.out.println();
    }

    public static void main(String[] args) {
        hollowsquare(5,5);
    }
}
