package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Logic for the bubble sort
        boolean didSwap = false;
        for (int i = n-1; i >=1 ; i--) {
            for (int j = 0; j <= i-1; j++) {
                if (arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                    didSwap = true;
                }
            }
            if (didSwap)
                return;
        }

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
