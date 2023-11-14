package Arrays;

public class Secondmax {
    public static void main(String[] args) {
        int[] arr = {10 ,34,45,8,20,4};
        int max = arr[0];
        int SecMax= arr[0];
        for(int i =1;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                SecMax= max;
                max =arr[i];
            }
            else if (SecMax<arr[i] && arr[i]!=max)
            {
                SecMax=arr[i];
            }
        }
        System.out.println(SecMax);
    }
}
