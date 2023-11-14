package Arrays;

import java.util.Scanner;

public class ReverseArrayInplace {
    static int[] inplace(int[] arr,int i,int j)
    {
        int temp=0;
        while(i<j)
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("enter the element ");
        for (int i = 0;i<nums.length;i++)
            nums[i]=sc.nextInt();
        int left=0,right=nums.length-1;
        inplace(nums,left,right);
        for (int i = 0;i<nums.length;i++)
            System.out.println(nums[i]);

    }
}
