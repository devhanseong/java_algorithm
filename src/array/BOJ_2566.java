package array;

import java.util.*;
import java.io.*;

public class BOJ_2566 {

    private static final int LENGTH = 9;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] nums = new int[LENGTH][LENGTH];

        for (int i = 0; i < LENGTH; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < LENGTH; j++) {
                nums[i][j] = Integer.valueOf(st.nextToken());
            }
        }

        int[] result = getResult(nums);
        output(result);
    }

    private static int[] getResult(int[][] nums) {
        int x = 1;
        int y = 1;
        int max = 0;
        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                if (nums[i][j] > max) {
                    max = nums[i][j];
                    x = i+1;
                    y = j+1;
                }
            }
        }
        return new int[] {max, x, y};
    }

    private static void output(int[] result) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result[0] + "\n");
        bw.write(result[1] + " " + result[2] + "\n");
        bw.flush();
        bw.close();
    }
}
