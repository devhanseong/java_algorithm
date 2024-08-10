package programmers.level2;


import java.util.Stack;

public class Programmers_42883 {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int needLen = number.length() - k;

        String[] numbers = number.split("");
        for (int i = 0; i < numbers.length; i++) {
            Integer curNum = Integer.valueOf(numbers[i]);

            while (k > 0 && !stack.isEmpty() && stack.peek() < curNum) {
                stack.pop();
                k--;
            }
            stack.push(curNum);
        }
        for (int i = 0; i < needLen; i++) {
            answer.append(stack.get(i));
        }
        return answer.toString();
    }
}
