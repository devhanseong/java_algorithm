package theory.validparentheses;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<String> stack = new Stack<>();

        String[] input = s.split("");

        for (String str : input) {
            if (stack.isEmpty() && (str.equals(")") || str.equals("}") || str.equals("]"))) {
              return false;
            } else if (str.equals("(") || str.equals("{") || str.equals("[")) {
                stack.push(str);
            } else if (str.equals(")")) {
                if (!stack.pop().equals("(")) {
                    return false;
                }
            } else if (str.equals("}")) {
                if (!stack.pop().equals("{")) {
                    return false;
                }
            } else if (str.equals("]")) {
                if (!stack.pop().equals("[")) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}

