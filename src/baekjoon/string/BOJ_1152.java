package baekjoon.string;

import java.io.*;
import java.util.*;

public class BOJ_1152 {

    private static final String delimiter = " ";

    public static void main(String[] args) throws Exception {
        String input = input();
        int length = getLength(input);
        output(length);
    }

    private static String input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    private static int getLength(String input) {
        StringTokenizer st = new StringTokenizer(input, delimiter);
        return st.countTokens();
    }

    private static void output(int length) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(length + "\n");
        bw.flush();
        bw.close();
    }
}
