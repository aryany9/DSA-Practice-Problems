package Patterns.SlidingWindow.Problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    static void bruteForceApproach(String s){
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                if(set.contains(s.charAt(j))){
                    break;
                }
                int length = j-i+1;
                maxLength = Math.max(length, maxLength);
                set.add(s.charAt(j));
            }
        }
        System.out.println("Max Length: "+maxLength);
    }

    static void twoPointerApproach1(String s) {
        int left = 0;

        if(s.isEmpty()){
            return;
        }

        int maxLength = Integer.MIN_VALUE;
        Set<Character> set = new HashSet<>();

        // Outer loop for traversing the string.
        for (int right = 0; right < s.length(); right++) {
            if (set.contains(s.charAt(right))){
                // If duplicate element is found
                while (left < right && set.contains(s.charAt(right))){
                    set.remove(s.charAt(left));
                    left++;
                }
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right-left+1);
        }
        System.out.println("Max Length: "+maxLength);
    }


    static void twoPointerApproachWithString(String s){
        int left = 0;
        int maxLength = 0;
        int startIndex = 0;
        Set<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            int currentLength = right - left + 1;

            if (currentLength > maxLength) {
                maxLength = currentLength;
                startIndex = left;
            }
        }

        System.out.println( "Length: " + maxLength + ", Substring: \"" + s.substring(startIndex, startIndex + maxLength) + "\"");
    }


    static void twoPointerApproach2(String s){
        int maxLength = 0;

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        int left = 0, right = 0;
        int n = s.length();

        while (right < n){
            if (map.containsKey(s.charAt(right))) left = Math.max(map.get(s.charAt(right)) + 1, left);
            map.put(s.charAt(right), right);

            maxLength = Math.max(maxLength, right-left+1);
            right++;
        }

        System.out.println("Max Length: "+maxLength);
    }

    public static void main(String[] args) {
//        String i = "cadbzabcd";

//        String i = "pwwkew";

        String i = "abcabcbb";

        // Brute Force Approach
        bruteForceApproach(i);

        // Two Pointer Approach 1
        twoPointerApproach1(i);

        // Two Pointer Approach 2
        twoPointerApproach2(i);

        // Two Pointer Approach With String in return
        twoPointerApproachWithString(i);

    }
}
