package Patterns.SlidingWindow.Problems;

public class MaxConsecutiveOnes {

    public static int bruteForce(int[] arr, int k){
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            int zeroes = 0;
            for (int j = i; j < arr.length; j++) {
                if(arr[j] == 0){
                    zeroes++;
                }
                if(zeroes <=k){
                    int length = j-i+1;
                    maxLength = Math.max(maxLength, length);
                }
                else {
                    break;
                }
            }
        }

        System.out.println("Max Length (BF): "+maxLength);
        return maxLength;
    }

    public static int twoPointer1(int[] nums, int k){
        int maxLength = 0;
        int left = 0;
        int right = 0;
        int zeroes = 0;
        while (right<nums.length){
            if(nums[right] == 0){
                zeroes++;
            }

            while (zeroes > k){
                if (nums[left] == 0){
                    zeroes--;
                }
                left++;
            }

            if(zeroes<=k){
                int length = right-left+1;
                maxLength = Math.max(maxLength, length);
            }

            right++;
        }

        System.out.println("Max Length (TP1): "+maxLength);
        System.out.println("Space Complexity (TP1): O(2N)");
        System.out.println("Time Complexity (TP1): O(1)");
        return maxLength;
    }

    public static int twoPointer2(int[] nums, int k){
        int maxLength = 0;
        int left = 0;
        int right = 0;
        int zeroes = 0;
        while (right<nums.length){
            if(nums[right] == 0){
                zeroes++;
            }

            if (zeroes > k){
                if (nums[left] == 0){
                    zeroes--;
                }
                left++;
            }

            if(zeroes<=k){
                int length = right-left+1;
                maxLength = Math.max(maxLength, length);
            }

            right++;
        }

        System.out.println("Max Length (TP1): "+maxLength);
        System.out.println("Space Complexity (TP1): O(N)");
        System.out.println("Time Complexity (TP1): O(1)");
        return maxLength;
    }

    public static void main(String[] args) {
        int[] input = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;

        int result = bruteForce(input, k);
        System.out.println("BF: "+result);


        int result1 = twoPointer1(input, k);
        System.out.println("TP1: "+result1);


        int result2 = twoPointer2(input, k);
        System.out.println("TP2: "+result2);
    }
}
