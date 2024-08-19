package leetcode;

public class LeetCode_268 {
    public int missingNumber(int[] nums) {
        int[] temp = new int[nums.length + 1];
        for (int num : nums) {
            temp[num] += 1;
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}
