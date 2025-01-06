package DataStructures.String.Problems;

import java.util.HashSet;
import java.util.Set;

/*
    3. Longest Substring Without Repeating Characters

    Given a string s, find the length of the longest substring without repeating characters.
    Example 1:
        Input: s = "abcabcbb"
        Output: 3
        Explanation: The answer is "abc", with the length of 3.

    Example 2:
        Input: s = "bbbbb"
        Output: 1
        Explanation: The answer is "b", with the length of 1.

    Example 3:
        Input: s = "pwwkew"
        Output: 3
        Explanation: The answer is "wke", with the length of 3.
        Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubString {

    public static int lengthOfLongestSubstring(String s){
        /*
        * SLIDING WINDOW TECHNIQUE
        * 1. Use two pointers (left and right) to represent a window of characters. Expand or shrink the window as needed while keeping track of unique characters
        * 2. HashSet: A HashSet is used to store characters in the current window, ensuring no duplicates exist.
        * */
        int n = s.length();
        int maxlength = 0;
        Set<Character> charSet = new HashSet<>(); // HashSet Method
        int left = 0;

        for (int right = 0; right < n; right++){
            if(!charSet.contains(s.charAt(right))) { // Making sure no duplicate char should be there
                charSet.add(s.charAt(right));
                maxlength = Math.max(maxlength, right - left + 1);
            } else {
                while (charSet.contains(s.charAt(right))){
                    charSet.remove(s.charAt(left)); // Sliding the Window
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }

        /*
         * Working Example
         * STEP 1:
         *     right = 0;
         *     Adding P into Set
         *     maxLength = (0, 0-0+1) => 1;
         *     left = 0;
         *     [P]
         * Step 2:
         *     right = 1;
         *     Adding W into Set
         *     maxLength = (1, 1-0+1) => 2;
         *     left = 0;
         *     [P, W]
         * Step 3:
         *     right = 2;
         *     Deleting P, W from Set
         *     left = 2;
         *     maxLength = 2;
         *     [W]
         * Step 4:
         *     right = 3;
         *     Adding K into Set
         *     left = 2;
         *     maxLength = (2, 3-2+1) = 2;
         *     [W, K]
         * Step 5:
         *     right = 4;
         *     Adding E into Set
         *     left = 2;
         *     maxLength = (3, 4-2+1) = 3;
         *     [W, K, E]
         * Step 6:
         *     right = 5;
         *     Deleting W from Set
         *     left = 5;
         *     maxLength = (3, 5-5+1) = 3;
         *     [W]
         * Returning MaxLength => 3
         */

        return maxlength;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        int substringLength = lengthOfLongestSubstring(s);
        System.out.println("String Length: "+s.length()); // 6
        System.out.println("Substring Length: "+ substringLength);

    }
}
