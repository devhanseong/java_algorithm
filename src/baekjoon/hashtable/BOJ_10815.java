package baekjoon.hashtable;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_10815 {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            Set<String> set = new HashSet<>();
            br.readLine(); // 버림
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                set.add(st.nextToken());
            }
            Integer count = Integer.valueOf(br.readLine());
            int[] answer = new int[count];
            String[] input = br.readLine().split(" ");
            for (int i = 0; i < count; i++) {
                if (set.contains(input[i])) {
                    answer[i] = 1;
                }
            }
            for (int i : answer) {
                bw.write(i + " ");
            }
            bw.flush();
        }
    }
}
