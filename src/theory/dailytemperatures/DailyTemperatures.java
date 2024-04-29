package theory.dailytemperatures;

import java.util.Stack;

public class DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        int[] days = new int[length];

        Stack<int[]> stack = new Stack<>();
        for (int curIdx = 0; curIdx < length; curIdx++) {
            while (!stack.isEmpty() && stack.peek()[1] < temperatures[curIdx]) {
                int prevIdx = stack.pop()[0];
                days[prevIdx] = curIdx - prevIdx;
            }
            stack.push(new int[]{curIdx, temperatures[curIdx]});
        }
        return days;
    }

}
