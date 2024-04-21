package loop;

import java.io.*;

public class BOJ_2739 {

    public static void main(String[] args) throws Exception {
        String input = input();
        output(Integer.valueOf(input));
    }

    private static String input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    private static void output(int number) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 1 ; i <= 9 ; i++) {
            bw.write(String.format("%d * %d = %d\n", number, i, number * i));
        }
        bw.flush();
        bw.close();
    }
}
