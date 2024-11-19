package baekjoon.deque;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ_28279 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            Deque<Integer> deque = new ArrayDeque<>();
            int times = Integer.valueOf(br.readLine());
            for (int i = 0; i < times; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                solution(deque, st, bw);
            }
            bw.flush();
        }
    }

    private static void solution(Deque<Integer> deque, StringTokenizer st, BufferedWriter bw) throws IOException {
        String command = st.nextToken();
        if ("1".equals(command)) {
            deque.addFirst(Integer.valueOf(st.nextToken()));
        } else if ("2".equals(command)) {
            deque.addLast(Integer.valueOf(st.nextToken()));
        } else if ("3".equals(command)) {
            if (deque.isEmpty()) {
                bw.write("-1\n");
            } else {
                bw.write(deque.removeFirst() + "\n");
            }
        } else if ("4".equals(command)) {
            if (deque.isEmpty()) {
                bw.write("-1\n");
            } else {
                bw.write(deque.removeLast() + "\n");
            }
        } else if ("5".equals(command)) {
            bw.write(deque.size() + "\n");
        } else if ("6".equals(command)) {
            if (deque.isEmpty()) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        } else if ("7".equals(command)) {
            if (deque.isEmpty()) {
                bw.write("-1\n");
            } else {
                bw.write(deque.peekFirst() + "\n");
            }
        } else if ("8".equals(command)) {
            if (deque.isEmpty()) {
                bw.write("-1\n");
            } else {
                bw.write(deque.peekLast() + "\n");
            }
        }
    }
}
