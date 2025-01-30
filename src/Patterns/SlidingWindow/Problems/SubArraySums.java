package Patterns.SlidingWindow.Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArraySums {
    public static void sumArray(int[] nums, int k){
        ArrayList<Integer> resultingArray = new ArrayList<>();
        int left = 0;
        int right = k-1;

        while(right < nums.length){
            int sum = 0;
            for (int i = left; i <= right; i++) {
                sum += nums[i];
            }
            resultingArray.add(sum);
            left++;
            right++;
        }

        System.out.println(Arrays.toString(resultingArray.toArray()));

    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, 3, 3, 4, 5, -1};
        int k = 4;

        sumArray(nums, k);
    }
}
