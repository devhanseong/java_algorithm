package baekjoon.hashtable;

import java.util.*;
import java.io.*;

public class BOJ_1620 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int length = Integer.valueOf(st.nextToken());
        int times = Integer.valueOf(st.nextToken());

        Map<String, String> mapOfString = new HashMap<>();
        Map<String, String> mapOfNumber = new HashMap<>();

        generateDictionaries(length, mapOfString, mapOfNumber);
        output(times, mapOfString, mapOfNumber);
    }

    private static void generateDictionaries(int length, Map<String, String> mapOfString, Map<String, String> mapOfNumber) throws Exception {
        for (int i = 0; i < length; i++) {
            String nameOfPocketMon = br.readLine();
            mapOfString.put(nameOfPocketMon, String.valueOf(i + 1));
            mapOfNumber.put(String.valueOf(i + 1), nameOfPocketMon);
        }
    }

    private static void output(int times, Map<String, String> mapOfString, Map<String, String> mapOfNumber) throws Exception {
        for (int i = 0; i < times; i++) {
            String input = br.readLine();

            if (mapOfString.containsKey(input)) {
                bw.write(mapOfString.get(input) + "\n");
            } else {
                bw.write(mapOfNumber.get(input) + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
