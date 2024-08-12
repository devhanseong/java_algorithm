package programmers.level2;

import java.util.HashMap;
import java.util.Map;

/**
 * O(n)
 * 피보나치 수열과 크게 차이 없다.
 * 3번째 칸에 오르긴 위해서는
 * 1번째 칸까지 오는 경우의 수 + 2번째 칸까지 오는 경우의 수
 * why) 1칸 또는 2칸을 갈 수 있으니 1 or 2에서 점프해서 와야한다.
 */
public class Programmers_12914 {

    private static final int MODULE_NUMBER = 1234567;

    public long solution(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        return jump(memo, n);
    }

    private int jump(Map<Integer, Integer> memo, int target) {
        //base - case : 1칸인경우 1가지
        if (target == 1) {
            return 1;
        }
        //base - case : 2칸인경우 1/1 , 2
        if (target == 2) {
            return 2;
        }
        if (!memo.containsKey(target)) {
            int a = jump(memo, target - 1);
            int b = jump(memo, target - 2);

            int sum = (a+b) % MODULE_NUMBER;

            memo.put(target, sum);
        }
        return memo.get(target);
    }
}
