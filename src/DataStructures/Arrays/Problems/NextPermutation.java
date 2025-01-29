package DataStructures.Arrays.Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class NextPermutation {
    public static void nextPermutation(int[] nums){
        System.out.println("input: "+Arrays.toString(nums));
        int combination = nums.length * nums.length;
        ArrayList<int[]> list = new ArrayList<int[]>();
        for (int i = 0; i < combination; i++) {
            int[] newPermutation = new int[3];
            int k = 0;
            newPermutation[k] = nums[i];
            k++;
            for (int j = 0; j < nums.length; j++) {
                if(i != j){
                    newPermutation[k] = nums[j];
                    k++;
                }
            }
            list.add(newPermutation);
        }
        for (int[] ints : list) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        nextPermutation(nums);
    }
}
