package baekjoon.queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;

// 입력 가능 수 10만
// 우선순위 큐 정렬 NlogN * 10만번
public class BOJ_1927 {

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            int times = Integer.valueOf(br.readLine());
            for (int i = 0; i < times; i++) {
                int input = Integer.valueOf(br.readLine());
                doSomething(pq, input, bw);
            }
            bw.flush();
        }
    }

    private static void doSomething(PriorityQueue<Integer> pq, int input, BufferedWriter bw) throws Exception {
        if (input != 0) {
            pq.offer(input);
        }
        if (input == 0 && pq.isEmpty()) {
            bw.write(0 + "\n");
        }
        if (input == 0 && !pq.isEmpty()) {
            bw.write(pq.poll() + "\n");
        }
    }
}
