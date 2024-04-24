package string;

import java.io.*;

public class BOJ_27866 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int idx = Integer.valueOf(br.readLine()) - 1;
        char result = getByIndex(input, idx);

        output(result);
    }

    private static char getByIndex(String input, int idx) {
        return input.charAt(idx);
    }

    private static void output(char result) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}
