package baekjoon.queue;

import java.util.*;
import java.io.*;

public class BOJ_18258 {
    private static final Deque<String> q = new LinkedList<>();
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private static final String PUSH = "push";
    private static final String POP = "pop";
    private static final String SIZE = "size";
    private static final String EMPTY = "empty";
    private static final String FRONT = "front";
    private static final String BACK = "back";

    public static void main(String[] args) throws Exception {
        int times = Integer.valueOf(br.readLine());
        for (int i = 0; i < times; i++) {
            doSomething(br.readLine());
        }
        output();
    }

    private static void doSomething(String input) throws Exception {
        StringTokenizer st = new StringTokenizer(input);
        String command = st.nextToken();

        if (command.equals(PUSH)) {
            q.add(st.nextToken());
        } else if (!q.isEmpty() && command.equals(FRONT)) {
            bw.write(q.peek() + "\n");
        } else if (q.isEmpty() && command.equals(FRONT)) {
            bw.write("-1\n");
        } else if (command.equals(SIZE)) {
            bw.write(q.size() + "\n");
        } else if (command.equals(EMPTY)) {
            bw.write(q.isEmpty() ? "1\n" : "0\n");
        } else if (!q.isEmpty() && command.equals(POP)) {
            bw.write(q.remove() + "\n");
        } else if (q.isEmpty() && command.equals(POP)) {
            bw.write("-1\n");
        } else if (!q.isEmpty() && command.equals(BACK)) {
            bw.write(q.peekLast() + "\n");
        } else if (q.isEmpty() && command.equals(BACK)) {
            bw.write("-1\n");
        }
    }

    private static void output() throws Exception {
        bw.flush();
        bw.close();
    }
}
