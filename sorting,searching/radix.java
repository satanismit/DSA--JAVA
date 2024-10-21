import java.util.Arrays;

public class radix {
    public static void rsort(int[] arr){

        int max=Arrays.stream(arr).max().getAsInt();

        //do count sort for every digit 

        for(int exp=1 ; max/exp>0; exp*=10){
            countsort(arr,exp);
        }

    }
    private static void countsort(int[] arr,int exp){
        int n=arr.length;
        int[] output=new int[n];
        int[] count=new int[10]; //for max value always become a 9

        Arrays.fill(count,0);

        for(int i=0;i<n; i++){
            count[(arr[i]/exp)%10]++;
        }
        System.out.println("count array for "+exp+" :"+Arrays.toString(count));

        for(int i=1; i<10; i++){
            count[i]+=count[i-1];
        }
        System.out.println("updated count array :"+Arrays.toString(count));

        for(int i=n-1; i>=0; i--){
            output[--count[(arr[i]/exp)%10]]=arr[i];
            
        }
        System.out.println("final array for "+exp+" : " +Arrays.toString(output));

        // for(int i=0;i<10; i++){
        //     arr[i]=output[i];
        // }
        System.arraycopy(output,0,arr,0,n);
    }
    public static void main(String[] args) {
        int[] arr={29,83,471,36,91,8};

        System.out.println("original array"+Arrays.toString(arr));
        rsort(arr);
        System.out.println("sorted array"+ Arrays.toString(arr));
    }
}
