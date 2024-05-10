package theory.dp.mincost;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/min-cost-climbing-stairs/
public class MinCostClimbingStairs {

    private Map<Integer, Integer> map = new HashMap<>();

    public int minCostClimbingStairs(int[] cost) {
        init(cost);
        return bottomUp(cost);
        // return topDown(cost, cost.length);
    }

    private int topDown(int[] cost, int n) {
        if (!map.containsKey(n)) {
            int minCost = Math.min(topDown(cost, n - 1) + cost[n - 1], topDown(cost, n - 2) + cost[n - 2]);
            map.put(n, minCost);
        }
        return map.get(n);
    }

    private int bottomUp(int[] cost) {
        int len = cost.length;
        for (int i = 2; i <= len; i++) {
            int minCost = Math.min(map.get(i - 2) + cost[i - 2], map.get(i - 1) + cost[i - 1]);
            map.put(i, minCost);
        }
        return map.get(len);
    }

    private void init(int[] cost) {
        map.put(0, 0);
        map.put(1, 0);
    }
}
