package Patterns.SlidingWindow.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/*
    PROBLEM: 1408. String Matching in an Array
    Given an array of string words, return all strings in words that is a substring of another word. You can return the answer in any order.

    A substring is a contiguous sequence of characters within a string

    Example 1:
    Input: words = ["mass","as","hero","superhero"]
    Output: ["as","hero"]
    Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
    ["hero","as"] is also a valid answer.

    Example 2:
    Input: words = ["leetcode","et","code"]
    Output: ["et","code"]
    Explanation: "et", "code" are substring of "leetcode".
*/
public class StringMatching {
    public static List<String> bruteForce(String[] words) {
        List<String> result = new ArrayList<>();
        int n = words.length;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
            System.out.println("i - "+ i + ", j - "+ j);
                System.out.println("words[i]: "+ words[i] + " words[j]: "+ words[j]);
                if(i != j && words[j].contains(words[i])) {
                    result.add(words[i]);
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = Arrays.asList("Leetcode", "et", "code").toArray(new String[0]);
        List<String> result = bruteForce(words);
        System.out.println(result);
    }
}
