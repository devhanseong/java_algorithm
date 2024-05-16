package theory.bruteforce;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    private static final int[] nums = {1, 2, 3, 4};

    public static void main(String[] args) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(answer, curr); // O(n!)
    }

    private static void backtrack(List<List<Integer>> answer, List<Integer> curr) {
        if (nums.length == curr.size()) {
            answer.add(new ArrayList<>(curr));
            return;
        }
        for (int num : nums) {
            if (!curr.contains(num)) {
                curr.add(num);
                backtrack(answer, curr);
                curr.remove(curr.size() - 1);
            }
        }
    }
}
