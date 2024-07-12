package leetcode;

import java.util.Arrays;

// O(NlogN) : 배열 정렬 후 가장 뒤에 있는 값 2개에서 -1을 한 후 곱한다.
public class LeetCode1464 {

    public int maxProduct(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int a = nums[len - 1] - 1;
        int b = nums[len - 2] - 1;
        return a * b;
    }
}
