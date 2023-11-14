package garbage;

public class Target {
    static int tar(int[] arr,int t,int index)
    {
        if(index==arr.length-1)
            return -1;
        else if(arr[index] ==t)
            return index;
        return tar(arr,t,index+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7};
        System.out.println(tar(arr,4,0));
    }

}
