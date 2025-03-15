package DataStructures.String.Problems;

import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s){
        String ss = "asda";
        ss.length();
        char[] arr = ss.toCharArray();
        int s1 = arr.length;

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            } else {
                if(!st.isEmpty() && (
                        (st.peek() == '(' && s.charAt(i) == ')') ||
                                (st.peek() == '{' && s.charAt(i) == '}') ||
                                (st.peek() == '[' && s.charAt(i) == ']'))){
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.empty();
    }

    public static void main(String[] args) {
        String s = "{}[]}";

        boolean result = isValid(s);
        System.out.println(result);
    }
}
