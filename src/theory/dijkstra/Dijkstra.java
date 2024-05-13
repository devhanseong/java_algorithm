package theory.dijkstra;

import java.util.*;

public class Dijkstra {
    private static Map<Integer, List<int[]>> grid = new HashMap<>();
    private static Map<Integer, Integer> cost = new HashMap<>();

    public static void main(String[] args) {
        int lastIdx = 9;
        dijkstra(new Node(0, 1), lastIdx);
    }

    public static int dijkstra(Node node, int last) {
        PriorityQueue<Node> q = new PriorityQueue<>((n1, n2) -> n1.value - n2.value);
        q.add(node);

        while (!q.isEmpty()) {
            Node currentNode = q.remove();
            if (!cost.containsKey(currentNode.x)) {
                cost.put(currentNode.x, currentNode.value);
                for (int[] next : grid.get(currentNode.x)) {
                    int value = next[0] + currentNode.value;
                    int nextNode = next[1];
                    q.add(new Node(value, nextNode));
                }
            }
        }
        return cost.get(last);
    }

    static class Node {
        int value;
        int x;

        public Node(int value, int x) {
            this.value = value;
            this.x = x;
        }
    }
}
