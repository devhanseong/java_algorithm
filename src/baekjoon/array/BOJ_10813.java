package baekjoon.array;

import java.io.*;
import java.util.*;

public class BOJ_10813 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int length = Integer.valueOf(st.nextToken());
        int times = Integer.valueOf(st.nextToken());

        int[] nums = createNums(length);
        change(br, nums, times);
        output(nums);
    }

    private static int[] createNums(int length) {
        int[] nums = new int[length];
        Arrays.setAll(nums, i -> i +1); // 구글링 기존 for문으로 초기화대신 Arrays.setAll을 사용하면 직관적이다.
        return nums;
    }

    private static void change(BufferedReader br, int[] nums, int times) throws Exception {
        for (int i = 0; i < times; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int firstIdx = Integer.valueOf(st.nextToken()) - 1;
            int secondIdx = Integer.valueOf(st.nextToken()) - 1;

            int temp = nums[firstIdx];
            nums[firstIdx] = nums[secondIdx];
            nums[secondIdx] = temp;
        }
    }

    private static void output(int[] nums) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int num : nums) {
            bw.write(num + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }

}
