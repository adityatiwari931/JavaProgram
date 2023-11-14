package Recursion;
// array is sorted or not
public class CheckArray {
    static boolean arr(int[] arr,int index)
    {
        if(index==arr.length-1)
        {
           return true;
        }
       else if(arr[index]>arr[index+1])
        {
            return false;
        }
        return arr(arr,index+1);
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,5};
        System.out.println(arr(arr,0));
    }
}
