package DataStructures.Arrays.Problems;

import java.util.*;

public class ThreeSum {
    public static void threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> s = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    // Checking whether the triplet is equals to zero
                    if(nums[i]+nums[j]+nums[k] == 0) {
                        Integer[] triplet = {nums[i], nums[j], nums[k]};

                        // Sorting the triplet to check whether the combination already exist or not.
                        Arrays.sort(triplet);

                        // Adding the triplet in the set.
                        s.add(List.of(triplet));
                    }
                }
            }
        }

        System.out.println(s);
    }

    public static void main(String[] args) {
        int[] input = {-1,0,1,2,-1,-4};
        threeSum(input);
    }
}
