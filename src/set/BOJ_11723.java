package set;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class BOJ_11723 {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            Set<Integer> set = new HashSet<>();
            StringBuilder sb = new StringBuilder();
            int times = Integer.valueOf(br.readLine());
            for (int i = 0; i < times; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String cmd = st.nextToken();
                if (cmd.equals("add")) {
                    set.add(Integer.valueOf(st.nextToken()));
                }
                if (cmd.equals("remove")) {
                    set.remove(Integer.valueOf(st.nextToken()));
                }
                if (cmd.equals("check")) {
                    int num = Integer.valueOf(st.nextToken());
                    if (set.contains(num)) {
                        sb.append("1\n");
                    }
                    if (!set.contains(num)) {
                        sb.append("0\n");
                    }
                }
                if (cmd.equals("toggle")) {
                    int num = Integer.valueOf(st.nextToken());
                    if (set.contains(num)) {
                        set.remove(num);
                    } else {
                        set.add(num);
                    }
                }
                if (cmd.equals("all")) {
                    for (int j = 1; j <= 20; j++) {
                        set.add(j);
                    }
                }
                if (cmd.equals("empty")) {
                    set.clear();
                }
            }
            bw.write(sb.toString());
            bw.flush();
        }
    }
}
