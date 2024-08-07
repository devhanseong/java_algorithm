package baekjoon.bfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class BOJ_2664 {

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.valueOf(br.readLine()); // 전체 인원
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.valueOf(st.nextToken());
            int end = Integer.valueOf(st.nextToken());
            int edge = Integer.valueOf(br.readLine()); // 관계의 수 (엣지의 갯수)

            Map<Integer, Integer> visit = new HashMap<>();
            List<List<Integer>> graph = createGraph(br, n, edge);

            int weight = bfs(graph, visit, start, end);
            bw.write(weight + "\n");
            bw.flush();
        }
    }

    private static int bfs(List<List<Integer>> graph, Map<Integer, Integer> visit, int start, int end) {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(start);
        visit.put(start, 0);

        while (!q.isEmpty()) {
            Integer curNode = q.poll();

            for (Integer nextNode : graph.get(curNode)) {
                Integer weight = visit.get(curNode);
                if (nextNode == end) {
                    return weight + 1;
                }
                if (!visit.containsKey(nextNode)) {
                    q.offer(nextNode);
                    visit.put(nextNode, weight + 1);
                }
            }
        }
        return -1;
    }

    private static List<List<Integer>> createGraph(BufferedReader br, int n, int edge) throws Exception {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < edge; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Integer p = Integer.valueOf(st.nextToken());
            Integer c = Integer.valueOf(st.nextToken());

            // 양방향 맵핑
            graph.get(p).add(c);
            graph.get(c).add(p);
        }
        return graph;
    }
}
