package programmers.level2;

import java.util.HashMap;
import java.util.Map;

public class Programmers_12945 {
    private static final int MODULE_NUMBER = 1234567;

    public int solution(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        return fibo(memo, n);
    }

    private int fibo(Map<Integer, Integer> memo, int target) {
        if (target == 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }
        if (!memo.containsKey(target)) {
            int a = fibo(memo, target - 1);
            int b = fibo(memo, target - 2);

            int sum = (a + b) % MODULE_NUMBER;
            memo.put(target, sum);
        }
        return memo.get(target);
    }
}
