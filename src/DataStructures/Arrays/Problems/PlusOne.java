package DataStructures.Arrays.Problems;

import java.util.Arrays;

/*
    You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
    The digits are ordered from most significant to least significant in left-to-right order.
    The large integer does not contain any leading 0's.

    Increment the large integer by one and return the resulting array of digits.

    Input: digits = [1,2,3]
    Output: [1,2,4]
    Explanation: The array represents the integer 123.
    Incrementing by one gives 123 + 1 = 124.
    Thus, the result should be [1,2,4].

    Input: digits = [9]
    Output: [1,0]
    Explanation: The array represents the integer 9.
    Incrementing by one gives 9 + 1 = 10.
    Thus, the result should be [1,0].
 */
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >= 0 ; i--) {
            if(digits[i] < 9){
                // If the digit is less than 9, increment it and return the array
                digits[i]++;
                return digits;
            }
            // If the digit is 9, set it to 0 (carry over)
            digits[i] = 0;
        }
        // If all the digits are 9, we need an extra digit at the start
        int[] result = new int[digits.length + 1];
        result[0] = 1; // The carry makes the most significant digit 1
        return result;
    }

    public static void main(String[] args) {
//        int[] digits = {1,2,3};
//        int[] digits = {1,2,9};
        int[] digits = {9,9,9};
        System.out.println(Arrays.toString(digits));
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
