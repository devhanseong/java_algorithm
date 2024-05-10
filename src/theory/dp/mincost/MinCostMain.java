package theory.dp.mincost;

public class MinCostMain {

    public static void main(String[] args) {
        MinCostClimbingStairs solution = new MinCostClimbingStairs();
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        //int[] cost = {10, 15, 20};
        int result = solution.minCostClimbingStairs(cost);
        System.out.println(result);
    }
}
