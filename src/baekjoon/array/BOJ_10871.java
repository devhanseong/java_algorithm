package baekjoon.array;

import java.util.*;
import java.io.*;

public class BOJ_10871 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        st.nextToken(); //길이 필요없음
        int target = Integer.valueOf(st.nextToken()); //타겟 넘버
        st = new StringTokenizer(br.readLine());
        br.close();
        search(st, target);
    }

    private static void search(StringTokenizer st, int target) {
        while(st.hasMoreTokens()) {
            String curNum = st.nextToken();
            if (Integer.valueOf(curNum) < target) {
                System.out.print(curNum + " ");
            }
        }
    }

}
