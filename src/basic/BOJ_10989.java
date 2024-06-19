package basic;

import java.io.*;
import java.util.Arrays;

public class BOJ_10989 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int count = Integer.valueOf(br.readLine());
            StringBuilder sb = new StringBuilder();

            int[] arr = new int[count];
            for (int i = 0; i < count; i++) {
                arr[i] = Integer.valueOf(br.readLine());
            }
            Arrays.sort(arr);
            for (int num : arr) {
                sb.append(num + "\n");
            }
            bw.write(sb.toString());
            bw.flush();
        }
    }
}
