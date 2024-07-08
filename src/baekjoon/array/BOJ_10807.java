package baekjoon.array;

import java.util.*;
import java.io.*;

public class BOJ_10807 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.valueOf(br.readLine());
        int[] nums = new int[length];
        String input = br.readLine();
        int target = Integer.valueOf(br.readLine());
        br.close();
        parse(nums, input);
        int count = countTarget(nums, target);
        output(count);
    }

    private static void parse(int[] nums, String input) {
        StringTokenizer st = new StringTokenizer(input);
        int idx = 0;
        while(st.hasMoreTokens()) {
            nums[idx] = Integer.valueOf(st.nextToken());
            idx++;
        }
    }

    private static int countTarget(int[] nums, int target) {
        int count = 0;
        for (int num : nums) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }

    private static void output(int count) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}
