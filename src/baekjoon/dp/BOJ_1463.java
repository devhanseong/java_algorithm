package baekjoon.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class BOJ_1463 {
    static Map<Integer, Integer> map = new HashMap<>(
            Map.of(1, 0, 2, 1, 3, 1)
    );

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int target = Integer.valueOf(br.readLine());
            dp(target);
            bw.write(map.get(target) + "\n");
            bw.flush();
        }
    }

    private static int dp(int n) {
        int value = 0;
        if (!map.containsKey(n)) {
            if (n % 6 == 0) {
                value = Integer.min(dp(n - 1), Integer.min(dp(n / 3), dp(n / 2))) + 1;
            } else if (n % 3 == 0) {
                value = Integer.min(dp(n / 3), dp(n - 1)) + 1;
            } else if (n % 2 == 0) {
                value = Integer.min(dp(n / 2), dp(n - 1)) + 1;
            } else {
                value = dp(n - 1) + 1;
            }
            map.put(n, value);
        }
        return map.get(n);
    }
}
