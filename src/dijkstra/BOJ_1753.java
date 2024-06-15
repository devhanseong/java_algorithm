package dijkstra;

import java.io.*;
import java.util.*;

public class BOJ_1753 {
    // 우선순위 큐 정렬 O(NlogN)
    // Edge의 수만큼 이동 or 방문 체크 O(n)
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)))
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int v = Integer.valueOf(st.nextToken());
            int e = Integer.valueOf(st.nextToken());

            int startNode = Integer.valueOf(br.readLine());

            Map<Integer, List<Integer[]>> graph = generateGraph(br, v, e);
            Map<Integer, Integer> cost = new HashMap<>();
            dijkstra(startNode, graph, cost);
            for (int key = 1; key <= v; key++) {
                Integer value = cost.get(key);
                if (value == null) {
                    bw.write("INF" + "\n");
                }
                if (value != null) {
                    bw.write(value + "\n");
                }
            }
        }
    }

    private static void dijkstra(int startNode, Map<Integer, List<Integer[]>> graph, Map<Integer, Integer> cost) {
        PriorityQueue<Integer[]> q = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));
        q.offer(new Integer[] {0, startNode});
        cost.put(startNode, 0);

        while (!q.isEmpty()) {
            Integer[] cur = q.poll();
            Integer currWeight = cur[0];
            Integer currNode = cur[1];

            for (Integer[] nextItem : graph.getOrDefault(currNode, new ArrayList<>())) {
                Integer nextWeight = nextItem[0] + currWeight;
                Integer nextNode = nextItem[1];
                if (!cost.containsKey(nextNode)) {
                    cost.put(nextNode, nextWeight);
                    q.offer(new Integer[] {nextWeight, nextNode});
                }
            }
        }
    }

    private static Map<Integer, List<Integer[]>> generateGraph(BufferedReader br, int v, int e) throws Exception {
        Map<Integer, List<Integer[]>> defaultGraph = createDefaultGraph(v);
        for (int i = 0; i < e; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Integer from = Integer.valueOf(st.nextToken());
            Integer to = Integer.valueOf(st.nextToken());
            Integer weight = Integer.valueOf(st.nextToken());
            defaultGraph.get(from).add(new Integer[]{weight, to});
        }
        return defaultGraph;
    }

    private static Map<Integer, List<Integer[]>> createDefaultGraph(int v){
        Map<Integer, List<Integer[]>> defaultGraph = new HashMap<>();
        for (int i = 1; i <= v; i++){
            defaultGraph.put(i, new ArrayList<>());
        }
        return defaultGraph;
    }
}
