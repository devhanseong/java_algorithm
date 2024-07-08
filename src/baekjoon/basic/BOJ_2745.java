package baekjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_2745 {
    public static void main(String[] args) throws IOException {
        Map<Character, Integer> map = createMap();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String input = st.nextToken();
        int n = Integer.valueOf(st.nextToken());

        int temp = 0;
        for (int i = 0; i < input.length(); i++) {
            char key = input.charAt(input.length() - 1 - i);
            temp += map.get(key) * Math.pow(n, i);
        }
        System.out.println(temp);
    }

    private static Map<Character, Integer> createMap() {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 65; i < 65 + 26; i++) {
            map.put((char) i, i - 55);
        }
        for (int i = 48; i < 48 + 10; i++) {
            map.put((char) i, i - 48);
        }
        return map;
    }
}
