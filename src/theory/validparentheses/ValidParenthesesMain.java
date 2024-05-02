package theory.validparentheses;

// https://leetcode.com/problems/valid-parentheses/description/
public class ValidParenthesesMain {

    public static void main(String[] args) {
        ValidParentheses solution = new ValidParentheses();
        boolean valid = solution.isValid("(]");
        System.out.println(valid);
    }

}
