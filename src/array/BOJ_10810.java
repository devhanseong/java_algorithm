package array;

import java.util.*;
import java.io.*;

public class BOJ_10810 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] result = parse(br, Integer.valueOf(st.nextToken()), Integer.valueOf(st.nextToken()));
        output(result);
    }

    private static int[] parse(BufferedReader br, int length, int times) throws Exception {
        int[] arr = new int[length];

        for (int i = 0; i < times; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int firstIdx = Integer.valueOf(st.nextToken());
            int lastIdx = Integer.valueOf(st.nextToken());
            int number = Integer.valueOf(st.nextToken());

            for (int j = firstIdx - 1; j <= lastIdx - 1; j++) {
                arr[j] = number;
            }
        }
        return arr;
    }

    private static void output(int[] result) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < result.length; i++) {
            bw.write(result[i] + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}
