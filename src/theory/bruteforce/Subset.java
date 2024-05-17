package theory.bruteforce;

import java.util.ArrayList;
import java.util.List;

// 백트래킹 특징 : 현재 상태를 더해주고, 재귀 호출, 현재 상태 제거
public class Subset {

    private static int[] nums = {1, 2, 3, 4};
    private static List<List<Integer>> answer = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i <= nums.length; i++) {
            backtrack(new ArrayList<Integer>(), 0, i);
        }
    }

    private static void backtrack(List<Integer> curr, int start, int len) {
        if (curr.size() == len) {
            answer.add(new ArrayList<>(curr));
            System.out.println(curr);
            return;
        }
        for (int i = start; i < nums.length; i++) {
            curr.add(nums[i]);
            backtrack(curr, i + 1, len);
            curr.remove(curr.size() - 1);
        }
    }
}
