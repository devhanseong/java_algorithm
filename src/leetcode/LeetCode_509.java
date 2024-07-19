package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 509. Fibonacci Number O(n) 각 타겟 숫자에 맞게 1번씩만 계산한다.
public class LeetCode_509 {
    public int fib(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        int result = fibo(memo, n);
        return result;
    }

    private int fibo(Map<Integer, Integer> memo, int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (!memo.containsKey(n)) {
            int a = fibo(memo, n - 1);
            int b = fibo(memo, n - 2);
            memo.put(n, a+b);
        }
        return memo.get(n);
    }
}
