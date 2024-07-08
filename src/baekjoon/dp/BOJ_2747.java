package baekjoon.dp;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class BOJ_2747 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            Map<Integer, Integer> memo = new HashMap<>();
            int target = Integer.valueOf(br.readLine());
            int ret = dp(memo, target);
            bw.write(ret + "\n");
            bw.flush();
        }
    }

    private static int dp(Map<Integer, Integer> memo, int target) {
        if (target == 0 || target == 1) {
            return target;
        }
        if (!memo.containsKey(target)) {
            int x = dp(memo, target - 1);
            int y = dp(memo, target - 2);
            memo.put(target, x + y);
        }
        return memo.get(target);
    }
}
