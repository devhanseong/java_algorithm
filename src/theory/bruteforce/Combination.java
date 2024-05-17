package theory.bruteforce;

import java.util.ArrayList;
import java.util.List;

// 백트래킹 특징 : 현재 상태를 더해주고, 재귀 호출, 현재 상태 제거
public class Combination {

    private static final int[] nums = {1, 2, 3, 4};
    private static final List<List<Integer>> answer = new ArrayList<>();

    public static void main(String[] args) {
        backtracking(new ArrayList<>(), 0);
    }

    private static void backtracking(List<Integer> curr, int start) {
        if (curr.size() == 2) {
            answer.add(new ArrayList<>(curr));
            System.out.println(curr);
            return;
        }
        for (int i = start; i < nums.length; i++) {
            curr.add(nums[i]);
            backtracking(curr, i + 1);
            curr.remove(curr.size() - 1);
        }
    }
}
