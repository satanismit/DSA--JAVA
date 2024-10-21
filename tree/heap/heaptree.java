import java.util.Scanner;

class heap {

    public static void insert(int[] a) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        // int[] arr1 = new int[a.length];
        for (int i = (a.length - 2) / 2; i >= 0; i--) {
            maxheap(a, i, a.length);
        }
        sc.close();
    }

    public static void maxheap(int[] ar, int index, int size) {
        int l = left(index);
        int r = right(index);

        int largest = index;
        if (l < ar.length && ar[l] > ar[largest]) {
            largest = l;
        } else {
            largest = index;
        }
        if (r < ar.length && ar[r] > ar[largest]) {
            largest = r;
        }
        if (largest != index) {
            int temp = ar[index];
            ar[index] = ar[largest];
            ar[largest] = temp;
            maxheap(ar, largest, size);
        }

    }

    public static int left(int i) {
        return 2 * i + 1;
    }

    public static int right(int i) {
        return 2 * i + 2;
    }

    public static int root(int i) {
        return (i - 2) / 2;
    }

}

public class heaptree {
    public static void main(String[] args) {

        heap obj = new heap();
        Scanner sc = new Scanner(System.in);
        System.out.println("size of heap tree :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        heap.insert(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
// 8 20 9 4 15 10 7 22 3 12