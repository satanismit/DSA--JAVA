public class practical2_sorting{

    public static int bubble(int[] arr,int n)
    {
        int swap=0;
        int flag=0,swp=0;
        for(int i=0;i<n-1;i++)
        {
            for (int j=0; j<n-1-i; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                    flag=-1;
                    swp++;
                }
            }
          
            if(flag==0)
            {
              break;
            }
        }
        
        return swp;
    }
    void display(int[] arr)
    {
        for(int i: arr)
        {
            System.out.print(i);
        }
    }
   
    public static void selection_inc(int[] arr, int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int min_ind=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[min_ind]>arr[j])
                {
                    min_ind=j;
                }
            }
            int temp=arr[min_ind];
            arr[min_ind]=arr[i];
            arr[i]=temp;
        }
    }

    public static void selection_dec(int[] arr, int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int max_ind=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[max_ind]<arr[j])
                {
                    max_ind=j;
                }
            }
            int temp=arr[max_ind];
            arr[max_ind]=arr[i];
            arr[i]=temp;
        }
    }
    
    public static void insertion(int[] arr ,int n)
    {
        for(int i=1;i<n; i++)
        {
            int key=arr[i];
            int j=i-1;
            while(arr[j]>key && j>0)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;

        }
    }
    
    public static void main(String[] ars)
    {
        practical2_sorting obj =new practical2_sorting();
        int[] arr = {1,2,3,5,4};
        int size= arr.length;
         
         int swp=bubble(arr,size);
         System.out.println("\n using bubble sort :"+"total swap:"+swp);
        obj.display(arr);

        int[] arr1={2,5,1,6,0,8,7};
        System.out.println("\n using selection sort inc:");
        selection_inc(arr1,arr1.length);
        obj.display(arr1);

        int[] arr3={2,5,1,6,0,8,7};
        System.out.println("\n using selection sort dec :");
        selection_dec(arr3,arr3.length);
        obj.display(arr3);

        int[] arr2={6,4,1,0,8,4,34,30};
        insertion(arr2,arr2.length);
        System.out.println("\n using insertion sort :");
        obj.display(arr);
        
    }
}