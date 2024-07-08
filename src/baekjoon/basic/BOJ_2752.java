package baekjoon.basic;

import java.io.*;
import java.util.*;

public class BOJ_2752 {

    public static void main(String[] args) throws Exception {
        String input = input();
        int[] nums = parseInput(input);
        Arrays.sort(nums);
        output(nums);
    }

    private static String input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    private static int[] parseInput(String input) {
        int[] arr = new int[3];
        StringTokenizer st = new StringTokenizer(input);
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.valueOf(st.nextToken());
        }
        return arr;
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
