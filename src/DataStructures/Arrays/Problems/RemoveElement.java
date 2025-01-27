package DataStructures.Arrays.Problems;

import java.util.Arrays;

/*
    Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
    The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

    Input: nums = [3,2,2,3], val = 3
    Output: 2, nums = [2,2,_,_]
    Explanation: Your function should return k = 2, with the first two elements of nums being 2.
    It does not matter what you leave beyond the returned k (hence they are underscores).
 */
public class RemoveElement {
    public static int removeElement(int[] nums, int val){
        int uniqueElements = 0;

        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[uniqueElements] = nums[i]; // Place it at the `uniqueIndex`
                uniqueElements++; // Increment the index for unique elements
            }
        }

        System.out.println(Arrays.toString(nums));
        return uniqueElements;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;

        System.out.println(removeElement(nums, val));
    }
}
