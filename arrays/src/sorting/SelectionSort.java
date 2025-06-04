package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        //Take the array inputs
        for (int i = 0; i < n; i++) {
            int ele = scanner.nextInt();
            arr[i] = ele;
        }

        // Get the minimum idx and swap with ith index
        for (int i = 0; i < n - 1; i++) {
            int minIdx = getMin(arr, i, n-1);
            swap(arr, i, minIdx);
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    static int getMin(int[] arr, int startIdx, int endIdx){
        int minIdx = startIdx;
        for (int i = startIdx; i <= endIdx; i++) {
            if(arr[i] < arr[minIdx]){
                minIdx = i;
            }
        }
        return minIdx;
    }
}
