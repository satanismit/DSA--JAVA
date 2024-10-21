//time  complexity ---> O(n+max)
//space complexity --> O(n,maximum element)
public class count {
    
    public static void main(String[] args) {
        
        int[] arr={2,2,4,3,5,0,9,8,8,7,5,1};
        int n=arr.length;
        int max=0;
        //find maximum value that we have 
        for(int i=0;i<n;i++)
        {
             if(max<arr[i])  max=arr[i];
        }
        //create count array of max size
        int[] count=new int[max+1];

        //count frquency of each element and store into count array 
        for(int i=0;i<n;i++)
            count[arr[i]]++;
        
        //update count array with addition 
        for(int i=1; i<=max; i++)
             count[i]+=count[i-1];    
        
  
        //create another array for stroing in sorted order
        int[] b=new int[n];

        //after one decreament update value at specific index
        for(int i=0;i<n; i++ )
            b[--count[arr[i]]]=arr[i];
        
        //assignining sorted array to original array 
        for(int i=0;i<n; i++)
        arr[i]=b[i];

        for(int i:arr)
        System.out.print(i+" ");



    }
}
