package basic;

import java.io.*;
import java.util.*;

public class BOJ_10869 {

    public static void main(String[] args) throws Exception {
        String input = input();
        StringTokenizer st = new StringTokenizer(input);
        output(Integer.valueOf(st.nextToken()), Integer.valueOf(st.nextToken()));
    }

    private static String input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    private static void output(int x, int y) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sum(x,y) + "\n");
        bw.write(subtract(x,y) + "\n");
        bw.write(multiple(x,y) + "\n");
        bw.write(divide(x,y) + "\n");
        bw.write(module(x,y) + "\n");
        bw.flush();
        bw.close();
    }

    private static int sum(int x, int y) {
        return x + y;
    }

    private static int subtract(int x, int y) {
        return x - y;
    }

    private static int multiple(int x, int y) {
        return x * y;
    }

    private static int divide(int x, int y) {
        return x / y;
    }

    private static int module(int x, int y) {
        return x % y;
    }

}
