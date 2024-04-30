package theory.longestsequence;

import java.util.*;

public class LongestSequence {

    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (Integer num : nums) {
            map.put(num, 0);
        }

        for (Integer key : map.keySet()) {
            int prev = key - 1;
            if (!map.containsKey(prev)) {
                int count = 1; //해당 key값이 시작임을 보장한다.
                int next = key + 1;
                while (map.containsKey(next)) {
                    next++;
                    count++;
                }
                result = Math.max(result, count);
            }
        }
        return result;
    }
}
