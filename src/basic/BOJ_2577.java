package basic;

import java.io.*;

public class BOJ_2577 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            int[] count = new int[10];

            int a = Integer.valueOf(br.readLine());
            int b = Integer.valueOf(br.readLine());
            int c = Integer.valueOf(br.readLine());

            int target = multiply(a, b, c);

            String str = String.valueOf(target);
            for (char ch : str.toCharArray()) {
                int targetIndex = ch - '0';
                count[targetIndex]++;
            }
            for (int i : count) {
                System.out.println(i);
            }
        }
    }

    private static int multiply(int a, int b, int c) {
        return a * b * c;
    }
}
