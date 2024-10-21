//worst case : O(n^2)
// avg case : O(nlogn)
public class quick {

    public static int  partition(int[] arr,int low,int high){

        int pivot=arr[high]; //always last element is become pivot 
        int i=low-1;
        // in this loop all smallest elements moves to left of the pivot
        for(int j=low; j<high; j++){

            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        //now we set pivot at correct position 
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp; //because of every time we take last element as pivot 
         return i;
    }

    public static void quicksort(int[] arr,int low,int high){

        if(low<high){
            
           int pidx=partition(arr,low,high);//to find pivot index
           //apply quicksort on left side of pivot 
           quicksort(arr,low,pidx-1);
           //apply quicksort on right side of pivot 
           quicksort(arr,pidx+1,high);
        }
        else{
            return;
        }

    }
    public static void main(String[] args) {
        
        int[] arr={6,3,9,5,2,8};
        int n=arr.length;
        quicksort(arr,0,n-1);

        for(int i:arr){
            System.out.print(i+" ");
        }

}
}

