package baekjoon.basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2003 {

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int length = Integer.valueOf(st.nextToken());
            int target = Integer.valueOf(st.nextToken());

            int[] nums = createSortedNums(br, length);
            int count = 0;

            int start = 0;
            int last = length - 1;
            while (start < last) {
                if (nums[start] + nums[last] == target) {
                    count++;
                    last--;
                }
                if (nums[start] + nums[last] < target) {
                    start++;
                }
                if (nums[start] + nums[last] > target) {
                    last--;
                }
            }
            bw.write(count + "\n");
            bw.flush();
        }
    }

    private static int[] createSortedNums(BufferedReader br, int length) throws Exception {
        int[] nums = new int[length];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < length; i++) {
            nums[i] = Integer.valueOf(st.nextToken());
        }
        Arrays.sort(nums);
        return nums;
    }
}
