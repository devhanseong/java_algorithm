package baekjoon.bruteforce;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2798 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            Integer n = Integer.valueOf(st.nextToken()); // 카드의 개수
            Integer m = Integer.valueOf(st.nextToken()); // 최대값

            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.valueOf(st.nextToken());
            }

            int result = 0;
            for (int i = 0; i < n - 2; i++) {
                for (int j = i + 1; j < n - 1; j++) {
                    for (int k = j + 1; k < n; k++) {
                        int temp = arr[i] + arr[j] + arr[k];
                        if (result < temp && temp <= m) {
                            result = temp;
                        }
                    }
                }
            }
            bw.write(result + "\n");
            bw.flush();
        }
    }
}
