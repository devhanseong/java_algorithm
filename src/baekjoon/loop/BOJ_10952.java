package baekjoon.loop;

import java.io.*;
import java.util.*;

public class BOJ_10952 {

    private static final String STOP_CONDITION = "0 0";

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        while(!input.equals(STOP_CONDITION)) {
            StringTokenizer st = new StringTokenizer(input);
            int x = Integer.valueOf(st.nextToken());
            int y = Integer.valueOf(st.nextToken());
            bw.write((x+y) + "\n");
            input = br.readLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
