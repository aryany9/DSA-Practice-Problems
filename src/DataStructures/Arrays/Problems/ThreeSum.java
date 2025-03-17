package DataStructures.Arrays.Problems;

import java.util.*;

public class ThreeSum {
    public static void bruteForceApproach(int[] nums) {
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


    public static void approachOne(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();

        // a + b + c = 0;
        // b + c = -a
        // c = -a - b;

        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            Set<Integer> s = new HashSet<>();

            for (int j = i+1; j < nums.length; j++) {
                int b = nums[j];
                int c = -a - b;

                if(s.contains(c)){
                    List<Integer> triplet = Arrays.asList(a, b, c);

                    // Sorting to keep it unique before storing
                    Collections.sort(triplet);

                    result.add(triplet);
                }
                s.add(b);
            }
        }

        System.out.println(result);
    }

    public static void betterApproach(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> result = new HashSet<>();

        // Sorting the array first
        Arrays.sort(nums);

        // Iterating the Loop
        for (int i = 0; i < n; i++) {

            // skipping i if already has the same value
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int j = i+1;
            int k = n-1;

            int target = 0;

            while(j < k) {
                int sum = nums[i]+nums[j]+nums[k];

                if(sum < target){
                    j++;
                } else if (sum > target){
                    k--;
                } else {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                    result.add(triplet);

                    // Iterating the  pointers
                    j++;
                    k--;

                    // Skipping j if already visited with same value
                    while (j < k && nums[j] == nums[j-1]) j++;
                }
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] input = {-1,0,1,2,-1,-4};
        bruteForceApproach(input);
        approachOne(input);
        betterApproach(input);
    }
}
