package Patterns.SlidingWindow.Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumLengthSubArray {
    public static void maximumLengthSubArraySum(int[] nums, int k){
        int maxLength = 0;
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int[] subArray = new int[nums.length-i];
            int sum = 0;
            int l =0;
            for (int j = i; j < nums.length; j++) {
                subArray[l++] = nums[j];
                sum += nums[j];
                if(sum <= k){
                    maxLength = Math.max(maxLength, j-i+1);
                } else if (sum > k) {
                    break;
                }
            }
            list.add(subArray);
        }
        System.out.println(maxLength);
        System.out.println(Arrays.deepToString(list.toArray()));
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 7, 10};
        int k = 14;
        maximumLengthSubArraySum(nums, k);
    }
}
