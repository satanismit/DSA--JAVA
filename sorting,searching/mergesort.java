//space complexity  --> O(n)
//time comlexity  --(nlogn) 
public class mergesort
{
    public static void conquer(int[] arr,int si,int mid,int ei)  //O(n)
    {
        int[] merged = new int[ei-si+1];
        int in1=si;
        int in2=mid+1;
        int o=0;
        while(in1<=mid && in2<=ei)
        {
            if(arr[in2]<=arr[in1])
            {
                merged[o++]=arr[in2++];
            }
            else
            {
                merged[o++]=arr[in1++];
            }
        }

        while(in1<=mid)
        {
            merged[o++]=arr[in1++];
        }

        while(in2<=ei)
        {
            merged[o++]=arr[in2++];
        }

        //arr =Arrays.copyOfRange(merged, 0,ei-si+1);
        for(int i=0,j=si; i<merged.length;i++,j++)
        {
            arr[j]=merged[i];
        }
    }
    public static void divide(int[] arr,int si,int ei)   //O(log n)
    {
        if(si>=ei)
        {
            return;
        }
         int mid=si+(ei-si)/2;
         divide(arr,si,mid);
         divide(arr,mid+1,ei);
         conquer(arr,si,mid,ei);
    }
    public static void main(String[] args) 
    {
        int []ar={8,4,5,2,9,0,1};
        divide(ar,0 , ar.length-1);
        for(int i: ar)
        {
            System.out.print(i+" ");
        }
        System.out.println(" ");
    }
}