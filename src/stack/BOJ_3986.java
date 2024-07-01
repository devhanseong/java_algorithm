package stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ_3986 {

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int result = 0;
            int times = Integer.valueOf(br.readLine());
            for (int i = 0; i < times; i++) {
                String[] items = br.readLine().split("");
                if(goodWord(items)) {
                    result++;
                }
            }
            bw.write(result + "\n");
            bw.flush();
        }
    }

    private static boolean goodWord(String[] items) {
        Deque<String> stack = new ArrayDeque<>();
        for (String item : items) {
            if (!stack.isEmpty() && stack.peek().equals(item)) {
                stack.pop();
            } else {
                stack.push(item);
            }
        }
        return stack.isEmpty();
    }
}
