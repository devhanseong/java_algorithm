package baekjoon.condition;

import java.util.*;
import java.io.*;

public class BOJ_1330 {

    public static void main(String[] args) throws Exception {
        String input = input();
        StringTokenizer st = new StringTokenizer(input);
        String result = condition(Integer.valueOf(st.nextToken()), Integer.valueOf(st.nextToken()));
        output(result);
    }

    private static String input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    private static String condition(int x, int y) {
        if (x > y) {
            return ">";
        }
        if (x < y) {
            return "<";
        }
        return "==";
    }

    private static void output(String result) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}
