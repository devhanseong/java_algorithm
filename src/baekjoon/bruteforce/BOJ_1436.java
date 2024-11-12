package baekjoon.bruteforce;

import java.io.*;

public class BOJ_1436 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.valueOf(br.readLine());
            int number = 0;
            int count = 0;

            // n이 원하는 숫자가 될 때 까지 증가한 숫자값만큼 while문 수행
            while (n != count) {
                number++;
                if (String.valueOf(number).contains("666")) {
                    count++;
                }
            }

            bw.write(number + "\n");
        }
    }
}
