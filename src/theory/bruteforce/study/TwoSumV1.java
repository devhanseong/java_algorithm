package theory.bruteforce.study;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// 중복 X
public class TwoSumV1 {

    private static final int[] nums = {4, 9, 7, 5, 1};
    private static int neededCount = 2;
    private static int target = 12;

    public static void main(String[] args) {
        List<Integer> ans = twosum(0, new Stack<Integer>());
        System.out.println(ans);
    }

    public static List<Integer> twosum(int start, Stack<Integer> curr) {
        if (curr.size() == neededCount) {
            int sum = curr.stream().mapToInt(Integer::new).sum();
            if (sum == target) {
                return curr;
            }
        }
        for (int i = start; i < nums.length; i++) {
            curr.push(nums[i]);
            List<Integer> ret = twosum(i + 1, curr);
            if (ret != null) {
                return ret;
            }
            curr.pop();
        }
        return null;
    }
}
