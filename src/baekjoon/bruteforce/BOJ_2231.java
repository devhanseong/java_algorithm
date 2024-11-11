package baekjoon.bruteforce;

import java.io.*;

public class BOJ_2231 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.valueOf(br.readLine());
            int min = findMin(n);
            bw.write(min + "\n");
            bw.flush();
        }
    }

    // O(n) * 자릿수 => 100만 * 7 => O(n)
    static int findMin(int n) {
        for (int i = 0; i < n; i++) {
            String str = String.valueOf(i);
            int len = str.length();
            int sum = i; // 기본값 숫자 그대로
            
            for (int j = 0; j < len; j++) {
                sum += Character.getNumericValue(str.charAt(j));
            }
            
            if (sum == n) {
                return i;
            }
        }
        return 0;
    }
}
