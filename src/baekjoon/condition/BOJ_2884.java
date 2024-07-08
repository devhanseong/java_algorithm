package baekjoon.condition;

import java.io.*;
import java.util.*;

public class BOJ_2884 {

    private static final int MINUTE_GAP = 45;
    private static final int HOUR_MINUTES = 60;

    public static void main(String[] args) throws Exception {
        String input = input();
        StringTokenizer st = new StringTokenizer(input);
        int[] result = clock(Integer.valueOf(st.nextToken()), Integer.valueOf(st.nextToken()));
        output(result);
    }

    private static String input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    private static int[] clock(int hour, int minute) {
        int afterMinute = minute - MINUTE_GAP;
        if (afterMinute < 0) {
            hour--;
            afterMinute += HOUR_MINUTES;
        }
        if (hour < 0) {
            hour = 23;
        }
        return new int[] {hour, afterMinute};
    }

    private static void output(int[] result) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result[0] + " " + result[1] + "\n");
        bw.flush();
        bw.close();
    }
}
