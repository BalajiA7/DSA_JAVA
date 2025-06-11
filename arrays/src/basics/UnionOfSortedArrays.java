package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class UnionOfSortedArrays {
    public static void main(String[] args) {
        int[] arr1 =  {1,2,2,3,5,6};
        int[] arr2 = {3,3,4,7,8,8,9};
        optimalApproach(arr1, arr2);
    }

    private static void bruteForceApproach(int[] arr1, int[] arr2) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int val: arr1){
            set.add(val);
        }

        for (int val: arr2){
            set.add(val);
        }

        int[] res = new int[set.size()];

        int i = 0;
        for (int val: set){
            res[i++] = val;
        }

        System.out.println(Arrays.toString(res));
    }

    private static void optimalApproach(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int i = 0;
        int j = 0;
        int lastEle = Integer.MIN_VALUE;
        ArrayList<Integer> res = new ArrayList<>();

        while (i < n && j < m){
            if (arr1[i] <= arr2[j]){
                if(lastEle != arr1[i]) {
                    res.add(arr1[i]);
                    lastEle = arr1[i];
                }
                i++;
            }else{
                if( lastEle != arr2[j]) {
                    res.add(arr2[j]);
                    lastEle = arr2[j];
                }
                j++;
            }
        }

        while (i < n){
            if (lastEle != arr1[i]){
                res.add(arr1[i]);
                lastEle = arr1[i];
            }
            i++;
        }

        while (j < m){
            if (lastEle != arr2[j]){
                res.add(arr2[j]);
                lastEle = arr2[j];
            }
            j++;
        }

        System.out.println(res);
    }
}
