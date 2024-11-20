package baekjoon.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class BOJ_24416 {

    private static Map<Integer, Integer> memo = new HashMap<>();
    private static int fiboCount = 0;
    private static int fibonacciCount = 0;

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {
            int n = Integer.valueOf(br.readLine());
            fibo(n);
            fibonacci(n);
            bw.write(fiboCount + " " + fibonacciCount + "\n");
        }
    }

    private static int fibo(int n) {
        if (n == 1 || n == 2) {
            fiboCount++;
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    private static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        if (!memo.containsKey(n)) {
            int num1 = fibonacci(n - 1);
            int num2 = fibonacci(n - 2);
            fibonacciCount++;
            memo.put(n, num1 + num2);
        }
        return memo.get(n);
    }
}
