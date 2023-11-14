package Recursion;

import java.util.Scanner;

public class TargetIndexret {
    static int arrayIndex(int[] arr,int index,int target)
    {
        if(index==arr.length)
            return -1;
        if(arr[index]==target)
            return index;
        return arrayIndex(arr,index+1,target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array element ");
        for(int i =0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        System.out.println(arrayIndex(arr,0,target));
        sc.close();

    }
}
