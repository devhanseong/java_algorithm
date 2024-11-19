package baekjoon.basic;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1085 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] nums = new int[4]; // x,y,w,h를 담을 배열 선언
            setUpNums(nums, st);

            // 양의 방향 절대값 또는 음의방향 비교 후 최소값 구하기
            // min(w-x, h-y, x, y)
            int[] gaps = {nums[2] - nums[0], nums[3] - nums[1], nums[0], nums[1]};
            int min = calculateMin(gaps);
            bw.write(min + "\n");
            bw.flush();
        }
    }

    private static int calculateMin(int[] gaps) {
        int min = Integer.MAX_VALUE;
        for (int gap : gaps) {
            if (gap < min) {
                min = gap;
            }
        }
        return min;
    }

    private static void setUpNums(int[] nums, StringTokenizer st) {
        int idx = 0;
        while (st.hasMoreTokens()) {
            nums[idx] = Integer.valueOf(st.nextToken());
            idx++;
        }
    }

}
