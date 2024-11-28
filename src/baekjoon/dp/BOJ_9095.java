package baekjoon.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class BOJ_9095 {

    private static Map<Integer, Integer> map =
            new HashMap<>(Map.of(1, 1, 2, 2, 3, 4));

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.valueOf(br.readLine());
            for (int i = 0; i < n; i++) {
                int target = Integer.valueOf(br.readLine());
                int result = dp(target);
                bw.write(result + "\n");
            }
            bw.flush();
        }
    }

    private static int dp(int target) {
        if (!map.containsKey(target)) {
            int value = dp(target - 1) + dp(target - 2) + dp(target - 3);
            map.put(target, value);
        }
        return map.get(target);
    }
}
