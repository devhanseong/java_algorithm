package baekjoon.array;

import java.io.*;

public class BOJ_2562 {

    private static final int LENGTH = 9;

    public static void main(String[] args) throws Exception {
        int[] nums = new int[LENGTH];
        input(nums);
        int[] result = findMax(nums);
        output(result);
    }

    private static void input(int[] nums) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < LENGTH; i++) {
            nums[i] = Integer.valueOf(br.readLine());
        }
        br.close();
    }

    private static int[] findMax(int[] nums) throws Exception {
        int max = 0;
        int idx = 0;
        for (int i = 0; i < LENGTH; i++) {
            if (nums[i] > max) {
                max = nums[i];
                idx = i+1;
            }
        }
        return new int[] {max, idx};
    }

    private static void output(int[] result) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result[0] + "\n");
        bw.write(result[1] + "\n");
        bw.flush();
        bw.close();
    }
}
