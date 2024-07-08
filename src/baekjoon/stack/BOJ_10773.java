package baekjoon.stack;

import java.io.*;
import java.util.*;

public class BOJ_10773 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int times = Integer.valueOf(br.readLine());

        Stack<Integer> result = doSomeThing(br, times);
        int sum = sum(result);
        output(sum);
    }

    private static Stack<Integer> doSomeThing(BufferedReader br, int times) throws Exception {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < times; i++) {
            int money = Integer.valueOf(br.readLine());

            if (!stack.isEmpty() && money == 0) {
                stack.pop();
            } else {
                stack.push(money);
            }
        }
        return stack;
    }

    private static int sum(Stack<Integer> stack) {
        int sum = 0;
        while(!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }

    private static void output(int sum) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }

}
