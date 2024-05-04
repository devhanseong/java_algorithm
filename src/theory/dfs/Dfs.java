package theory.dfs;

import java.util.*;

public class Dfs {
    // 인접 행렬 : int[][] graph
    // 인접 리스트 :
    private static final Map<Node, List<Node>> graph = new HashMap<>();
    private static final List<Node> visit = new ArrayList<>();

    public static void main(String[] args) {
        dfs(new Node("A"));
    }

    static void dfs(Node start) {
        visit.add(start);

        for (Node nextNode : graph.get(start)) {
            if (!visit.contains(nextNode)) {
                dfs(nextNode);
            }
        }
    }

    static class Node {
        String node;

        Node(String node) {
            this.node = node;
        }
    }
}
