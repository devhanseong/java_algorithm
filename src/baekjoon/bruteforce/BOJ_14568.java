package baekjoon.bruteforce;

import java.io.*;

public class BOJ_14568 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int candy = Integer.valueOf(br.readLine());
        int count = 0;

        for (int a = 1; a <= candy; a++) {
            for (int b = 1; b <= candy; b++) {
                for (int c = 1; c <= candy; c++) {
                    if (a >= b + 2 && c % 2 == 0) {
                        if (a + b + c == candy) {
                            count++;
                        }
                    }
                }
            }
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}
