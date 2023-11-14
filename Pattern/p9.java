package Pattern;

public class p9 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                if (j <= i)
                {
                    System.out.print(j);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for (int k = 2; k <= i; k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
