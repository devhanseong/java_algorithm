package array;

import java.io.*;

public class BOJ_3052 {

    private static final int TIMES = 10;
    private static final int LENGTH = 42;

    public static void main(String[] args) throws Exception {
        int[] nums = createNums();
        int result = calculate(nums);
        output(result);
    }

    private static int[] createNums() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[LENGTH];
        for (int i = 0; i< TIMES; i++) {
            int mod = Integer.valueOf(br.readLine()) % LENGTH;
            nums[mod] = 1;
        }
        br.close();
        return nums;
    }

    private static int calculate(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num != 0) {
                count++;
            }
        }
        return count;
    }

    private static void output(int result) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}
