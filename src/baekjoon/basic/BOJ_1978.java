package baekjoon.basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 소수찾기
public class BOJ_1978 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Integer times = Integer.valueOf(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;
        for (int i = 0; i < times; i++) {
            Integer target = Integer.valueOf(st.nextToken());

            for (int j = 2; j <= target; j++) {
                if (j == target) {
                    count++;
                }
                if (target % j == 0) {
                    // 소수가 아님
                    break;
                }
            }
        }
        bw.write(count + "\n");
        bw.flush();
    }
}
