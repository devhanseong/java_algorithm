package basic;

import java.io.*;
import java.util.*;

public class BOJ_1000 {

    public static void main(String[] args) throws Exception {
        String input = input();
        StringTokenizer st = new StringTokenizer(input);
        int result = sum(Integer.valueOf(st.nextToken()), Integer.valueOf(st.nextToken()));
        output(result);
    }

    private static String input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    private static int sum(int x, int y) {
        return x + y;
    }

    private static void output(int result) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }


}
