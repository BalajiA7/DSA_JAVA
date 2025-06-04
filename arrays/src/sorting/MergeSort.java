package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {3,2,4,1,3};
        mergeSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    static void mergeSort(int[] arr, int low, int high){
        if(low == high) return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, high, mid);
    }

    static void merge(int[] arr, int low, int high, int mid){
        int[] temp = new int[high - low + 1];
        int l = low;
        int r = mid + 1;
        int i = 0;

        while(l <= mid && r <= high){
            if (arr[l] <= arr[r]){
                temp[i] = arr[l];
                l++;
            }else{
                temp[i] = arr[r];
                r++;
            }
            i++;
        }

        while (l <=mid){
            temp[i] = arr[l];
            l++;
            i++;
        }

        while (r <= high){
            temp[i] = arr[r];
            r++;
            i++;
        }

        for (int idx = low; idx <= high ; idx++) {
            arr[idx]  = temp[idx - low];
        }
    }
}
