package theory.bfs;

import java.util.*;

public class Bfs {
    public static void main(String[] args) {
        // 인접 행렬 : int[][] graph
        // 인접 리스트 :
        Map<Node, List<Node>> graph = new HashMap<>();
        List<Node> visit = bfs(graph, new Node("A"));
    }

    static List<Node> bfs(Map<Node, List<Node>> graph, Node start) {
        Queue<Node> q = new LinkedList<>();
        List<Node> visit = new ArrayList<>();

        q.add(start);
        visit.add(start);

        while (!q.isEmpty()) {
            Node currentNode = q.remove();

            for (Node nextNode : graph.get(currentNode)) {
                if (!visit.contains(nextNode)) {
                    q.add(nextNode);
                    visit.add(nextNode);
                }
            }
        }
        return visit;
    }

    static class Node {
        String node;

        Node(String node) {
            this.node = node;
        }
    }


}
