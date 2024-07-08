package baekjoon.stack;

import java.util.*;
import java.io.*;

public class BOJ_9012 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int times = Integer.valueOf(br.readLine());

        for (int i = 0; i < times; i++) {
            Stack<String> stack = new Stack<>();
            String[] input = br.readLine().split("");

            for (String str : input) {
                if (str.equals("(")) {
                    stack.push(")");
                } else if (!stack.isEmpty() && str.equals(")")) {
                    stack.pop();
                } else if (stack.isEmpty() && str.equals(")"))  {
                    stack.push(")");
                    break;
                }
            }
            String result = stack.isEmpty() ? "YES" : "NO";
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }

}
