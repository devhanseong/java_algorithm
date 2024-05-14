package theory.dijkstra.networkdelaytime;

import java.util.*;

// https://leetcode.com/problems/network-delay-time/
// 다익스트라 알고리즘 : 트리정렬 logN * N(반복)
public class NetworkDelayTime {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> graph = createGraph(times);
        Map<Integer, Integer> cost = new HashMap<>();
        dijkstra(graph, cost, k);
        return getMax(cost, n);
    }

    private void dijkstra(Map<Integer, List<int[]>> graph, Map<Integer, Integer> cost, int startNode) {
        Queue<int[]> q = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));
        q.add(new int[]{0, startNode});

        while (!q.isEmpty()) {
            int[] cur = q.remove();
            int curValue = cur[0];
            int curNode = cur[1];

            if (!cost.containsKey(curNode)) {
                cost.put(curNode, curValue);
                for (int[] next : graph.getOrDefault(curNode, new ArrayList<>())) {
                    int nextValue = next[0] + curValue;
                    int nextNode = next[1];
                    q.add(new int[]{nextValue, nextNode});
                }
            }
        }
    }

    private int getMax(Map<Integer, Integer> cost, int n) {
        if (cost.size() != n) {
            return -1;
        }
        return cost.values().stream().mapToInt(Integer::new).max().orElse(-1);
    }

    private Map<Integer, List<int[]>> createGraph(int[][] times) {
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int[] time : times) {
            graph.putIfAbsent(time[0], new ArrayList<>());
            graph.get(time[0]).add(new int[]{time[2], time[1]});
        }
        return graph;
    }
}
