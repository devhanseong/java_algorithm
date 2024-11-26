package baekjoon.hashtable;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class BOJ_13414 {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Map<String, Integer> map = new HashMap<>();
            int priority = 1;
            int availablePeople = Integer.valueOf(st.nextToken());
            int inputCount = Integer.valueOf(st.nextToken());

            // 해시테이블의 기본 메서드 들은 O(1)
            for (int i = 0; i < inputCount; i++) {
                String number = br.readLine();
                map.put(number, priority);
                priority++;
            }

            List<String> keys = new ArrayList<>(map.keySet());

            // value값을 기준으로 key를 정렬해야해서 O(NlogN)
            keys.sort(Comparator.comparing(map::get));
            int min = Integer.min(availablePeople, keys.size());
            for (int i = 0; i < min; i++) {
                bw.write(keys.get(i) + "\n");
            }
            bw.flush();
        }
    }
}
