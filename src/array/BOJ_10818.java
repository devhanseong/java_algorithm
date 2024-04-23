package array;

import java.io.*;
import java.util.*;

public class BOJ_10818 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine(); // 필요없음
        StringTokenizer st = new StringTokenizer(br.readLine());
        search(st);
    }

    private static void search(StringTokenizer st) {
        int firstNum = Integer.valueOf(st.nextToken());
        int max = firstNum;
        int min = firstNum;

        while (st.hasMoreTokens()) {
            int curNum = Integer.valueOf(st.nextToken());
            if (curNum > max) {
                max = curNum;
            }
            if (curNum < min) {
                min = curNum;
            }
        }
        System.out.print(min + " " + max);
    }
}
