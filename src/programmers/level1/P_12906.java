package programmers.level1;

import java.util.Stack;

// O(n) : Stack peek()해서 값이 다르면 stack에 push한다.
public class P_12906 {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (Integer num : arr) {
            if (stack.isEmpty()) {
                stack.push(num);
            } else if (!stack.isEmpty() && stack.peek() != num) {
                stack.push(num);
            }
        }
        int[] answer = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        return answer;
    }
}
