package basics;

import java.util.Arrays;

public class MoveAllZeros {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,1,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveAllZeroToRight(int[] nums, int n){
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0){
                for (int j = i+1; j < n; j++) {
                    if (nums[j] != 0) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }
    }

    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;

        while(i < n && j < n){
            while(nums[i] != 0){
                i++;
            }
            j = i + 1;
            while(nums[j] == 0){
                j++;
            }
            // Swap logic
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
        }
    }
}
