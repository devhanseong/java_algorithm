package queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ_2075 {
    // n번 입력하고 n번 큐에서 뽑는다. O(n)
    // 우선순위 큐 정렬 O(NlogN)
    // >> 입력 받을 때 n번 받고 n개를 큐에 넣어야해서 O(n**2)
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)))
        {
            int n = Integer.valueOf(br.readLine());
            PriorityQueue<Integer> q = createPriorityQueue(br, n);
            Integer nthLargeNumber = findNthLargeNumber(q, n);
            bw.write(nthLargeNumber + "\n");
            bw.flush();
        }
    }

    private static Integer findNthLargeNumber(PriorityQueue<Integer> q, int n) {
        for (int i = 0; i < n-1; i++) {
            q.poll();
        }
        return -1 * q.poll();
    }

    private static PriorityQueue<Integer> createPriorityQueue(BufferedReader br, int n) throws Exception {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                q.offer(-1 * Integer.valueOf(st.nextToken()));
            }
        }
        return q;
    }
}
