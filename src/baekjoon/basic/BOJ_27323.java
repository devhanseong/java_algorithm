package baekjoon.basic;

import java.io.*;

public class BOJ_27323 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int a = Integer.valueOf(br.readLine());
            int b = Integer.valueOf(br.readLine());

            int result = a * b;
            bw.write(result + "\n");
            bw.flush();
        }
    }

}
