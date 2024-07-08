package baekjoon.stack;

import java.io.*;
import java.util.*;

public class BOJ_10828 {

    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 시간 초과로 한번에 flush하기 위해 클래스 변수로 선언
    private static final Stack<String> stack = new Stack<>();
    private static final String PUSH = "push";
    private static final String POP = "pop";
    private static final String SIZE = "size";
    private static final String EMPTY = "empty";
    private static final String TOP = "top";

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
            stack.push(st.nextToken());
        } else if (input.equals(POP) && stack.isEmpty()) {
            output("-1");
        } else if (input.equals(POP) && !stack.isEmpty()) {
            output(stack.pop());
        } else if (input.equals(SIZE)) {
            output(String.valueOf(stack.size()));
        } else if (input.equals(EMPTY) && stack.isEmpty()) {
            output("1");
        } else if (input.equals(EMPTY) && !stack.isEmpty()) {
            output("0");
        } else if (input.equals(TOP) && !stack.isEmpty()) {
            output(stack.peek());
        } else if (input.equals(TOP) && stack.isEmpty()) {
            output("-1");
        }
    }

    private static void output(String value) throws Exception {
        bw.write(value + "\n");
    }

}
