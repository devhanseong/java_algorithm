package leetcode;

import java.util.Arrays;

public class LeetCode2974 {

    public int[] numberGame(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        Arrays.sort(nums); // O(NlogN)

        // O(n)
        for (int i = 0; i < len; i += 2) {
            int a = nums[i];
            int b = nums[i + 1];

            result[i] = b;
            result[i + 1] = a;
        }
        return result;
    }
}
