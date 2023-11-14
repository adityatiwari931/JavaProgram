package Arrays;
//subarrays and pair print
public class Subaray {
    public static void main(String[] args) {
        int[] arr = {-2,-1};
//        int sum =0;
        int max =Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++)
        {
            int sum=0;//for O(n^2) TC

            for(int j=i;j<arr.length;j++)
            {
//                for(int k = i;k<=j;k++)//O(n^3) TC
//                {
//                    System.out.println(arr[k]+" ");
                    sum+=arr[j];
                    if(sum>max)
                    max=sum;
//                }
                
            }
        }
        System.out.println(max);
    }
}
