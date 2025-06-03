import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4,2,5,1,3};
        quickSort(arr, 0, arr.length -1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int start, int end){
        if(start < end){
            int pIndex = partioning(arr, start, end);
            quickSort(arr, start, pIndex -1);
            quickSort(arr, pIndex + 1, end);
        }
    }

    public static int partioning(int[] arr, int start , int end){
        int l = start;
        int r = end;
        int pivotElement = arr[start];
        while ( l < r) {
            while (arr[l] <= pivotElement && l < end) {
                l++;
            }

            while (arr[r] > pivotElement && r > start) {
                r--;
            }

            if(l < r) swap(arr, l, r);
        }
        swap(arr, start, r);
        return r;
    }

    static void swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
