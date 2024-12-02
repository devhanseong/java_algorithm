package baekjoon.basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_20922 {

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int target = Integer.valueOf(br.readLine());
            long result = factorial(target);
            bw.write(result + "\n");
            bw.flush();
        }
    }

    private static long factorial(int target) {
        if (target == 0 || target == 1) {
            return 1;
        }
        return target * factorial(target - 1);
    }
}
