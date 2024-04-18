package basic;

import java.io.*;

public class BOJ_10926 {

    public static void main(String[] args) throws Exception {
        String input = input();
        output(input);
    }

    private static String input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    private static void output(String input) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(input);
        bw.write("??!\n");
        bw.flush();
        bw.close();
    }

}
