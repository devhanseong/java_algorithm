package baekjoon.queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;

public class BOJ_11286 {

    public static void main(String[] args) throws Exception {
        try (BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw =  new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int times = Integer.valueOf(br.readLine());
            String result = queue(br, times);
            bw.write(result);
            bw.flush();
        }
    }

    private static String queue(BufferedReader br, int times) throws Exception {
        PriorityQueue<Integer[]> q = new PriorityQueue<>(
                Comparator.<Integer[]>comparingInt(o -> o[0])
                        .thenComparingInt(o -> o[1])
        );
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            Integer input = Integer.valueOf(br.readLine());
            enqueue(q, input, sb);
        }
        return sb.toString();
    }

    private static void enqueue(PriorityQueue<Integer[]> q, Integer input, StringBuilder sb) {
        if (!q.isEmpty() && input == 0) {
            sb.append(q.poll()[1]).append("\n");
            return;
        }
        if (q.isEmpty() && input == 0) {
            sb.append(0).append("\n");
            return;
        }
        q.offer(new Integer[] {Math.abs(input), input});
    }
}
