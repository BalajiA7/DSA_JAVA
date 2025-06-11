package basics;

import java.util.Arrays;

public class ShiftArrayByK {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4,5};
        shiftRightByK(nums, 5);
        System.out.println(Arrays.toString(nums));
    }

    private static void shiftLeftByK(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        int[] res = new int[n];
        for(int i = k; i < n; i++){
            res[i-k] = nums[i];
        }

        for (int i = 0; i < k; i++) {
            res[n-k+i] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = res[i];
        }
    }

    private static void shiftRightByK(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        int[] res = new int[n];

        for(int i = n-k; i < n; i++){
            res[i] = nums[i];
        }

        for (int i = 0; i < n-k; i++) {
            res[i] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = res[i];
        }
    }
}
