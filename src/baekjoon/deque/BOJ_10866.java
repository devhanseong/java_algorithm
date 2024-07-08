package baekjoon.deque;

import java.util.*;
import java.io.*;

public class BOJ_10866 {
    private static final Deque<String> deque = new LinkedList<>();
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private static final String PUSH_FRONT = "push_front";
    private static final String PUSH_BACK = "push_back";
    private static final String POP_FRONT = "pop_front";
    private static final String POP_BACK = "pop_back";
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

        if (command.equals(PUSH_FRONT)) {
            deque.addFirst(st.nextToken());
        } else if (command.equals(PUSH_BACK)) {
            deque.addLast(st.nextToken());
        } else if (deque.isEmpty() && command.equals(POP_FRONT)) {
            bw.write("-1\n");
        } else if (!deque.isEmpty() && command.equals(POP_FRONT)) {
            bw.write(deque.removeFirst() + "\n");
        } else if (deque.isEmpty() && command.equals(POP_BACK)) {
            bw.write("-1\n");
        } else if (!deque.isEmpty() && command.equals(POP_BACK)) {
            bw.write(deque.removeLast() + "\n");
        } else if (command.equals(SIZE)) {
            bw.write(deque.size() + "\n");
        } else if (deque.isEmpty() && command.equals(EMPTY)) {
            bw.write("1\n");
        } else if (!deque.isEmpty() && command.equals(EMPTY)) {
            bw.write("0\n");
        } else if (deque.isEmpty() && command.equals(FRONT)) {
            bw.write("-1\n");
        } else if (!deque.isEmpty() && command.equals(FRONT)) {
            bw.write(deque.peek() + "\n");
        } else if (deque.isEmpty() && command.equals(BACK)) {
            bw.write("-1\n");
        } else if (!deque.isEmpty() && command.equals(BACK)) {
            bw.write(deque.peekLast() + "\n");
        }
    }

    private static void output() throws Exception {
        bw.flush();
        bw.close();
    }
}
