package Recursion.Pattern;

public class ReverseTriangle {
    static void printstar(int n)
    {
        if(n==0)
            return;
        System.out.print("*");
        printstar(n-1);
    }
    static void solidsquare(int row,int col)
    {
        if(row==0)
        {
            return;
        }
        printstar(col);
        System.out.println();
        solidsquare(row-1,col-1);
    }

    public static void main(String[] args) {
        solidsquare(5,5);
    }
}
