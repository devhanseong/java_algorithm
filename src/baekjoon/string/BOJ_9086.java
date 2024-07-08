package baekjoon.string;

import java.io.*;

public class BOJ_9086 {

    public static void main(String[] args) throws Exception {
        String[] strings = input();
        output(strings);
    }

    private static String[] input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int times = Integer.valueOf(br.readLine());
        String[] strings = new String[times];
        for (int i = 0; i < times; i++) {
            strings[i] = br.readLine();
        }
        return strings;
    }

    private static void output(String[] strings) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (String str : strings) {
            bw.write(str.charAt(0));
            bw.write(str.charAt(str.length() - 1) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
