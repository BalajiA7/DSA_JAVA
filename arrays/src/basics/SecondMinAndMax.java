package basics;

public class SecondMinAndMax {
    public static void main(String[] args) {
        int[] arr = {2,4,1,7,7,5};
        int n = arr.length;
        findOptSecondMinMax(n, arr);
    }


    private static void findOptSecondMinMax(int n, int[] arr) {
        if (n == 0 || n == 1) {
            System.out.println("Second small is -1 and Second max is -1");
            return;
        }

        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < small) {
                secondSmall = small;
                small = arr[i];
            }else if (arr[i] < secondSmall && arr[i] != small){
                secondSmall = arr[i];
            }

            if (arr[i] > large) {
                secondLarge = large;
                large = arr[i];
            }else if (arr[i] > secondLarge && arr[i] != large){
                secondLarge = arr[i];
            }
        }

        System.out.println(secondSmall + " " + secondLarge);
    }

    private static void findSecondMinMax(int n, int[] arr) {
        if(n == 0 || n == 1){
            System.out.println("Second min is -1 and Second max is -1");
            return;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int j : arr) {
            min = Math.min(j, min);
            max = Math.max(j, max);
        }

        for (int j : arr) {
            if (j != min) {
                secondMin = Math.min(j, secondMin);
            }
            if (j != max) {
                secondMax = Math.max(j, secondMax);
            }
        }

        System.out.println("second min is " + secondMin);
        System.out.println("second max is " + secondMax);
    }
}
