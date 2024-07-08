package baekjoon.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class BOJ_2748 {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ){
            Map<Long, Long> memo = new HashMap<>();
            Long target = Long.valueOf(br.readLine());
            Long result = fibo(memo, target);
            bw.write(result + "\n");
            bw.flush();
        }
    }

    private static Long fibo(Map<Long, Long> memo, Long target) {
        if (target == 0 || target == 1) {
            return target;
        }
        if (!memo.containsKey(target)) {
            Long curValue = fibo(memo, target - 1) + fibo(memo, target - 2);
            memo.put(target, curValue);
        }
        return memo.get(target);
    }
}
