package queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;

public class BOJ_2164 {

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            Queue<Integer> q = new ArrayDeque<>();
            Integer numbers = Integer.valueOf(br.readLine());
            for (int i = 1; i <= numbers; i++) {
                q.offer(i);
            }
            while (q.size() > 1) {
                q.poll(); //버리기
                Integer polledNumber = q.poll(); // 다시 넣을 숫자
                q.offer(polledNumber);
            }
            bw.write(q.poll() + "\n");
            bw.flush();
        }
    }

}
