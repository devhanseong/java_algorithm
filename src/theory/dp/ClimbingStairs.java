package theory.dp;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/climbing-stairs/
// 크고 복잡한 문제를 작은 서브 문제들로 나눈다.
// 작은 문제들이 중복되는 문제들이고, 중복되는 작은 문제들의 계산값을 구해 큰 문제를 해결하는 경우
// 주로 최대, 최소, 방법의 갯수
public class ClimbingStairs {

    private Map<Integer, Integer> map = new HashMap<>();

    public int climbStairs(int n) {
        init();
        //return bottomUp(n);
        return topDown(n);
    }

    private void init() {
        map.put(1, 1);
        map.put(2, 2);
    }

    private int topDown(int n) {
        if (!map.containsKey(n)) {
            map.put(n, topDown(n - 1) + topDown(n - 2));
        }
        return map.get(n);
    }

    private int bottomUp(int n) {
        for (int i = 3; i <= n; i++) {
            map.put(i, map.get(i - 1) + map.get(i - 2));
        }
        return map.get(n);
    }
}
