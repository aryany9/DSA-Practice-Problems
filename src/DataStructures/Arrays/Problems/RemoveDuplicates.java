package DataStructures.Arrays.Problems;

import java.util.Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates1(int[] nums) {
        int counter = 1;
        // The code starts iterating from i = 1 because we need to compare each element
        // with its previous element to check for duplicates.
        for (int i = 1; i < nums.length; i++) {
            // If the current element nums[i] is not equal to the previous element nums[i - 1],
            // it means we have encountered a new unique element.
            if(nums[i] != nums[i-1]){
            // In that case, we update nums[counter] with the value of the unique element at nums[i],
            // and then increment counter by 1 to mark the next position for a new unique element.
                nums[counter] = nums[i];
                counter++;
            //  By doing this, we effectively overwrite any duplicates in the array and only keep the unique elements.
            //  Once the loop finishes, the value of counter represents the length of the resulting array with duplicates removed.
            }
        }
        // Finally, we return counter as the desired result.
        return counter;
    }
    public static void main(String[] args) {
        int[] input = new int[] {0,0,1,1,1,2,2,3,3,4};
        System.out.println(Arrays.toString(input));
        System.out.println(removeDuplicates1(input));
        System.out.println(Arrays.toString(input));
    }
}
