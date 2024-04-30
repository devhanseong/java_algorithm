package hashtable;

import java.util.*;
import java.io.*;

public class BOJ_7785 {

    private static final String ENTER = "enter";
    private static final String LEAVE = "leave";

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int times = Integer.valueOf(br.readLine());

        Map<String, String> map = doSomething(br, times);
        String[] sortedResult = sort(map);

        output(sortedResult);
    }

    private static Map<String, String> doSomething(BufferedReader br, int times) throws Exception {
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < times; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String command = st.nextToken();

            if (command.equals(ENTER)) {
                map.put(name, "");
            }
            if (command.equals(LEAVE)) {
                map.remove(name);
            }
        }
        return map;
    }

    private static String[] sort(Map<String, String> map) {
        return map.keySet()
                .stream()
                .sorted(Comparator.reverseOrder())
                .toArray(String[]::new);
    }

    private static void output(String[] names) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (String name : names) {
            bw.write(name + "\n");
        }
        bw.flush();
        bw.close();
    }
}
