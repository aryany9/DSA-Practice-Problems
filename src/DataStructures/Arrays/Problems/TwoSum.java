package DataStructures.Arrays.Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /*
        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.

        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     */

    // Complement Logic
    public static int[] twoSumUsingComplement(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int curr = nums[i];
            int x = target - curr;
            if(map.containsKey(x)){
                return new int[] {map.get(x), i};
            }
            map.put(curr, i);
        }
        return null;
    }

    public static int[] twoSumUsingBruteForce(int[] nums, int target) {
        int[] array = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i != j && nums[i]+nums[j] == target){
                    array = new int[] {i, j};
                }
            }
        }
        return array;
    }

    static void printArray(int[] output){
        System.out.println(Arrays.toString(output));
    }

    public static void main(String[] args) {
        int[] input = new int[] {3, 2, 4};
        int target = 6;
        printArray(twoSumUsingComplement(input, target));
        printArray(twoSumUsingBruteForce(input, target));
    }
}
