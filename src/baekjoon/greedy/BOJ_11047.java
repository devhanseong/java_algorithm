package baekjoon.greedy;

import java.io.*;
import java.util.*;

public class BOJ_11047 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int result = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.valueOf(st.nextToken());
            int K = Integer.valueOf(st.nextToken());

            List<Integer> coins = setUpCoins(br, N);
            for (Integer coin : coins) {
                result += K / coin;
                K %= coin;
                if (K == 0) {
                    break;
                }
            }
            bw.write(result + "\n");
            bw.flush();
        }
    }

    private static List<Integer> setUpCoins(BufferedReader br, int N) throws IOException {
        List<Integer> coins = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            coins.add(Integer.valueOf(br.readLine()));
        }
        Collections.sort(coins, Comparator.reverseOrder());
        return coins;
    }
}
