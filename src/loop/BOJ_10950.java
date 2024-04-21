package loop;

import java.io.*;
import java.util.*;

public class BOJ_10950 {

    // 입력을 여러번 받을땐 메서드 분리불가 (백준 에러)
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loop = Integer.valueOf(br.readLine());
        for (int i = 0; i < loop; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.valueOf(st.nextToken());
            int y = Integer.valueOf(st.nextToken());
            bw.write((x+y) + "\n");
            bw.flush();
        }
        bw.close();
    }
}
