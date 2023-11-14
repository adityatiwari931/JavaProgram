package Arrays;

public class SubarraysProduct {
    public static void main(String[] args) {
        int[] nums ={-2,0,-1};
        int max =Integer.MIN_VALUE,sum =1;;
        for(int i =0;i<nums.length;i++)
        {
            sum=sum*nums[i];
            if(sum>max)
            {
                max=sum;
            }
            if(sum<0)
            {
                sum =0;
            }

        }
        System.out.println(max);
    }
}
