package baekjoon.loop;

import java.io.*;

public class BOJ_8393 {

    public static void main(String[] args) throws Exception {
        String loop = input();
        int sum = sum(Integer.valueOf(loop));
        output(sum);
    }

    private static String input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    private static int sum(int loop) {
        int sum = 0;
        for (int i = 1; i <= loop ; i++) {
            sum += i;
        }
        return sum;
    }

    private static void output(int result) throws Exception{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}
