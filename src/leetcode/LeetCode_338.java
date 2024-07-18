package leetcode;

// O(n**2)
public class LeetCode_338 {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];

        // O(n)
        for (int i = 0; i < n + 1; i++) {
            String stringNum = Integer.toBinaryString(i);

            char[] charArray = stringNum.toCharArray();
            int sum = 0;
            // O(n) 숫자가 커질수록 많이 반복한다.
            for (char c : charArray) {
                sum += Character.getNumericValue(c);
            }
            result[i] = sum;
        }
        return result;
    }
}
