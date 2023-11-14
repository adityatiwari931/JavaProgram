package Arrays;

public class ReverseArray {
    static  int[] ReverseArrays(int[] arr)
    {
        int[] ans = new int[arr.length];
        int j=0;
        for(int i= arr.length-1;i>= 0;i--)
        {
            ans[j] = arr[i];
            j++;
        }
        return ans;
    }
    static void PrintArray(int[] arr)
    {
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
//        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
//        int[] ans = ReverseArrays(arr);
        PrintArray(ReverseArrays(arr));

    }
}
