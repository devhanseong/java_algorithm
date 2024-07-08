package baekjoon.queue;

import java.io.*;
import java.util.*;

public class BOJ_10845 {

    private static final Deque<String> q = new LinkedList<>();
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private static final String PUSH = "push";
    private static final String POP = "pop";
    private static final String SIZE = "size";
    private static final String EMPTY = "empty";
    private static final String FRONT = "front";
    private static final String BACK = "back";

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int times = Integer.valueOf(br.readLine());

        for (int i = 0; i < times; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            doSomething(st);
        }
        bw.flush();
        bw.close();
    }

    private static void doSomething(StringTokenizer st) throws Exception {
        String input = st.nextToken();
        if (input.equals(PUSH)) {
            q.add(st.nextToken());
        } else if (input.equals(POP) && q.isEmpty()) {
            output("-1");
        } else if (input.equals(POP) && !q.isEmpty()) {
            output(q.remove());
        } else if (input.equals(SIZE)) {
            output(String.valueOf(q.size()));
        } else if (input.equals(EMPTY) && q.isEmpty()) {
            output("1");
        } else if (input.equals(EMPTY) && !q.isEmpty()) {
            output("0");
        } else if (input.equals(FRONT) && q.isEmpty()) {
            output("-1");
        } else if (input.equals(FRONT) && !q.isEmpty()) {
            output(q.peek());
        } else if (input.equals(BACK) && q.isEmpty()) {
            output("-1");
        } else if (input.equals(BACK) && !q.isEmpty()) {
            output(q.peekLast());
        }
    }

    private static void output(String value) throws Exception {
        bw.write(value + "\n");
    }
}
