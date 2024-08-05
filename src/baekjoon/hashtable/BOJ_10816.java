package baekjoon.hashtable;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_10816 {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            br.readLine(); // 버림
            Map<Integer, Integer> memo = new HashMap<>();
            StringTokenizer st = new StringTokenizer(br.readLine());

            // O(n)
            while (st.hasMoreTokens()) {
                Integer key = Integer.valueOf(st.nextToken());
                Integer value = memo.getOrDefault(key, 0);
                memo.put(key, value + 1);
            }
            br.readLine(); // 버림
            st = new StringTokenizer(br.readLine());

            // O(n)
            while (st.hasMoreTokens()) {
                Integer key = Integer.valueOf(st.nextToken());
                bw.write(memo.getOrDefault(key, 0) + " ");
            }
            bw.write("\n");
            bw.flush();
        }
    }
}
