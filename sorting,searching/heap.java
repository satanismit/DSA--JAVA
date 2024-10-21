import java.util.*;

public class  heap{
    public static int left(int index) {
        return 2 * index + 1;
    }

    public static int right(int index) {
        return 2 * index + 2;
    }

    public static void maxheap(int[] ar, int index, int size) {
        int l = left(index);
        int r = right(index);

        int largest = index;
        if (l < size && ar[l] > ar[largest]) {  
            largest = l;
        }
        if (r < size && ar[r] > ar[largest]) {  
            largest = r;
        }
        if (largest != index) {
            int temp = ar[index];
            ar[index] = ar[largest];
            ar[largest] = temp;
            maxheap(ar, largest, size);  
    }
}


public static void minheap(int[] ar, int index, int size) {
    int l = left(index);
    int r = right(index);

    int smallest = index;
    if (l < size && ar[l] < ar[smallest]) {  
        smallest = l;
    }
    if (r < size && ar[r] < ar[smallest]) {  
        smallest = r;
    }
    if (smallest != index) {
        int temp = ar[index];
        ar[index] = ar[smallest];
        ar[smallest] = temp;
        maxheap(ar, smallest, size);  
}
}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        
            //for converting maxheap 
            //starting with bigest non-leaf node
        for (int i = (n - 1) / 2; i >= 0; i--) {
            maxheap(arr, i, n);  
        }

       //for sorting maxheap 
        int size = n;
        while (size > 0) {
            int temp = arr[0];
            arr[0] = arr[size - 1];
            arr[size - 1] = temp;
          size--;
            maxheap(arr, 0, size);  
        }
        System.out.println("sorting in ascending order:");
        for (int i : arr) {
            System.out.print(i+" ");
        }

        // for (int i = (n - 1) / 2; i >= 0; i--) {
        //     minheap(arr, i, n);  
        // }

        //for sorting in minheap
        System.out.println();
        size=n;
        while (size > 0) {
            int temp = arr[0];
            arr[0] = arr[size - 1];
            arr[size - 1] = temp;
            size--;  
            minheap(arr, 0, size);  
        }
        System.out.println("sorting in decending order");
        for(int i:arr){
            System.out.print(i+" ");
        }

        
    }
}
