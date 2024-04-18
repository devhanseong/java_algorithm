package basic;

import java.util.*;
import java.io.*;

public class BOJ_10998 {

    public static void main(String[] args) throws Exception {
        String input = input();
        StringTokenizer st = new StringTokenizer(input);
        int result = multiple(Integer.valueOf(st.nextToken()), Integer.valueOf(st.nextToken()));
        output(result);
    }

    private static String input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    private static int multiple(int x, int y) {
        return x * y;
    }

    private static void output(int result) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }

}
