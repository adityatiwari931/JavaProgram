package Arrays;

import java.util.Scanner;

public class queryArrProb {
   static int[] FreqQuery(int[] arr)
    {
        int[] freq = new int[100005];
       for(int i=0;i< arr.length;i++)
       {
          freq[arr[i]]++;
       }
       return freq;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of Array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array element ");
        for(int i =0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the Query size ");
        int q = sc.nextInt();

        int[] freq = FreqQuery(arr);
        while (q>0)
        {
            System.out.println("Enter the value to be searched ");
            int QryValue = sc.nextInt();
            if(freq[QryValue]>0)
                System.out.println("Yes");
            else
                System.out.println("No");
            q--;
        }
        sc.close();


    }
}
