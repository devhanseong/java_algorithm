package loop;

import java.util.*;
import java.io.*;

public class TwoSum {

    public static void main(String[] args) throws Exception {
        String input = input();
        int target = Integer.valueOf(input());
        List<Integer> nums = parse(input);
        boolean result = twoSum(nums, target);
        output(result);
    }

    private static String input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    private static List<Integer> parse(String input) {
        StringTokenizer st = new StringTokenizer(input);
        List<Integer> nums = new ArrayList<>();
        while(st.hasMoreTokens()) {
            nums.add(Integer.valueOf(st.nextToken()));
        }
        return nums;
    }

    private static boolean twoSum(List<Integer> nums, int target) {
        for (int i = 0; i < nums.size() - 1; i++) {
            for (int j = 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void output(boolean result) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}
