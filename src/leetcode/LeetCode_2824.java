package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_2824 {
    public int countPairs(List<Integer> nums, int target) {
        List<List<Integer>> candidates = new ArrayList<>();

        //O(n**2) 완전 탐색
        for (Integer i = 0; i < nums.size() - 1; i++) {
            for (Integer j = i + 1; j < nums.size(); j++) {
                int a = nums.get(i);
                int b = nums.get(j);

                if (a + b < target) {
                    List<Integer> curr = List.of(i ,j);
                    candidates.add(curr);
                }
            }
        }
        return candidates.size();
    }
}
