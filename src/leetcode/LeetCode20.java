package leetcode;

import java.util.Stack;

public class LeetCode20 {
    public boolean isValid(String strs) {
        Stack<String> stack = new Stack<>();

        for (String str : strs.split("")) {
            if (str.equals("(")) {
                stack.push(")");
            } else if (str.equals("{")) {
                stack.push("}");
            } else if (str.equals("[")) {
                stack.push("]");
            } else if (!stack.isEmpty() && stack.peek().equals(str)) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
