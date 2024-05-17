package theory.bruteforce;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {

    private static final int[] nums = {4, 9, 7, 5, 1};
    private static int len = 2;
    private static int target = 12;

    public static void main(String[] args) {
        List<Integer> result = backtrack(0, new ArrayList<Integer>());
        System.out.println(result);
    }

    private static List<Integer> backtrack(int start, List<Integer> curr) {
        if (curr.size() == len) {
            int sum = 0;
            for (Integer i : curr) {
                sum += nums[i];
            }
            if (sum == target) {
                return curr;
            }
        }
        for (int i = start; i < nums.length; i++) {
            curr.add(i);
            List<Integer> ret = backtrack(i+1, curr);
            if (ret != null) {
                return ret;
            }
            curr.remove(curr.size() - 1);
        }
        return null;
    }
}
