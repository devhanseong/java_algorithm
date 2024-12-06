package baekjoon.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class BOJ_10826 {

    private static Map<Integer, BigInteger> memo = new HashMap<>(
            Map.of(0, BigInteger.valueOf(0), 1, BigInteger.valueOf(1))
    );

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.valueOf(br.readLine());
            BigInteger result = fibo(n);
            bw.write(result + "\n");
            bw.flush();
        }
    }

    private static BigInteger fibo(int target) {
        if (!memo.containsKey(target)) {
            BigInteger value = fibo(target - 1).add(fibo(target - 2));
            memo.put(target, value);
        }
        return memo.get(target);
    }
}
