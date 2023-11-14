import java.util.ArrayList;
import java.util.Scanner;

public class function {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the si");
        int[] arr ={2,2,3,4,0,1,2};
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                l.add(arr[i]);
            }
        }
        for(int i = 0;i< arr.length;i++)
        {
            if(arr[i]==0)
            {
                l.add(arr[i]);
            }
        }
        for (int i = 0;i<l.size();i++)
        {
            System.out.print(l.get(i)+" ");
        }
    }
}
