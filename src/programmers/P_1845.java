package programmers;

import java.util.*;

// O(n)
public class P_1845 {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return Integer.min(set.size(), nums.length / 2);
    }
}