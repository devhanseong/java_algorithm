package bruteforce;

import java.io.*;

public class BOJ_1816 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int times = Integer.valueOf(br.readLine());

        for (int i = 0; i < times; i++) {
            Long target = Long.valueOf(br.readLine());

            for (int j = 2; j <= 1000000; j++) {
                if (target % j == 0) {
                    bw.write("NO\n");
                    break;
                }
                if (j == 1000000) {
                    bw.write("YES\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
