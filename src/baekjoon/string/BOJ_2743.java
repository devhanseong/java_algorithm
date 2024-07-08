package baekjoon.string;

import java.io.*;

public class BOJ_2743 {

    public static void main(String[] args) throws Exception {
        String input = input();
        output(input.length());
    }

    private static String input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    private static void output(int length) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(length + "\n");
        bw.flush();
        bw.close();
    }
}
