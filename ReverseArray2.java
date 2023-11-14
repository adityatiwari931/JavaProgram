package Arrays;
//WITHOUT USING THE ANOTHER ARRAY
public class ReverseArray2 {
    static  int[] ReverseArrays(int[] arr)
    {
        int temp=0;
        int i=0,j= arr.length-1;
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
    static void PrintArray(int[] arr)
    {
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
//        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] ans = ReverseArrays(arr);
        PrintArray(ans);

    }
}
