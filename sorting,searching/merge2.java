public class merge2{

    public static void conquer(int[] a,int si,int ei,int mid){

        //to conquer we require one anothor array
        int[] merge=new int[ei-si+1];

        int ind1=si;
        int ind2=mid+1;

        //start sorting from si to ei 
        int o=0;
        while(ind1<=mid && ind2<=ei){
            if(a[ind1]<=a[ind2]){
                merge[o++]=a[ind1++];
            }
            else{
                merge[o++]=a[ind2++];
            }
        }
        while(ind1<=mid){
            merge[o++]=a[ind1++];
        }

        while(ind2<=ei){
            merge[o++]=a[ind2++];
        }

        //assign new array to original 
        for(int i=0,j=si; i<ei-si+1;  i++,j++){
            a[j]=merge[i];
        }
    }

    public static void divide(int[] a,int si,int ei){

        if(si>=ei){
            return;
        }

        int mid=(ei-si)/2+si;

        divide(a,si,mid);
        divide(a,mid+1,ei);
        conquer(a,si,ei,mid);

    }


    public static void main(String[] args) {
        
        int[]  arr={2,9,5,8,6,10,3};

        int n=arr.length;
        int si=0;
        int ei=n-1;
        
        divide(arr,0,n-1);
        for(int i:arr){
            System.out.print(i+" ");
        }

        
    }
    
}
