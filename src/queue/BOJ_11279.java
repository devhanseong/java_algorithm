package queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;

public class BOJ_11279 {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.comparingInt(i -> -i));
            int times = Integer.valueOf(br.readLine());
            String result = enqueueOrDequeue(q, times, br);
            bw.write(result);
            bw.flush();
        }
    }

    private static String enqueueOrDequeue(PriorityQueue<Integer> q, int times, BufferedReader br) throws Exception {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            Integer num = Integer.valueOf(br.readLine());
            if (!q.isEmpty() && num == 0) {
                sb.append(q.poll()).append("\n");
            } else if (q.isEmpty() && num == 0) {
                sb.append(num).append("\n");
            } else if (num != 0) {
                q.offer(num);
            }
        }
        return sb.toString();
    }

}
