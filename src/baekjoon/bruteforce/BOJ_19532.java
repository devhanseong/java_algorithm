package baekjoon.bruteforce;

import java.io.*;
import java.util.*;

public class BOJ_19532 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[6];
        for (int i = 0; i < 6; i++) {
            nums[i] = Integer.valueOf(st.nextToken());
        }

        for (int x = -999; x < 1000; x++) {
            for (int y = -999; y < 1000; y++) {
                if (nums[0] * x + nums[1] * y == nums[2]) {
                    if (nums[3] * x + nums[4] * y == nums[5]) {
                        bw.write(x + " " + y + "\n");
                    }
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
