package string;

import java.io.*;

public class BOJ_10988 {

    public static void main(String[] args) throws Exception {
        String input = input();
        String reverse = reverse(input);
        int result = palindrome(input, reverse);
        output(result);
    }

    private static String input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    private static String reverse(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    private static int palindrome(String input, String reverse) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != reverse.charAt(i)) {
                return 0;
            }
        }
        return 1;
    }

    private static void output(int result) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}
