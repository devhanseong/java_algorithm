package baekjoon.string;

import java.io.*;
import java.util.*;

public class BOJ_2675 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int times = Integer.valueOf(br.readLine());
        for (int i = 0; i < times; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = Integer.valueOf(st.nextToken());
            String input = st.nextToken();
            output(count, input);
        }
    }

    public static void output(int count, String input) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < count; j++) {
                bw.write(input.charAt(i));
            }
        }
        bw.write("\n");
        bw.flush();
    }

}
