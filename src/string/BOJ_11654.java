package string;

import java.io.*;

public class BOJ_11654 {

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
        bw.write((int)input.charAt(0)+ "\n");
        bw.flush();
        bw.close();
    }
}
