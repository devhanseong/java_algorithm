package baekjoon.array;

import java.io.*;

public class BOJ_10808 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int[] nums = new int[26];

        for (int i = 0; i < input.length(); i++) {
            int idx = (int) input.charAt(i) - 97;
            nums[idx] += 1;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

}
