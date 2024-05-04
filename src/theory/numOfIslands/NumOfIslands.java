package theory.numOfIslands;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// https://leetcode.com/problems/number-of-islands/description/
public class NumOfIslands {
    // 인접 행렬
    private static final int[][] graph = new int[10][10];
    private static final List<Node> visit = new ArrayList<>();
    private static int count = 0 ;

    public static void main(String[] args) {
        int xLength = graph.length;
        int yLength = graph[0].length;

        // O(n**2)
        for (int i = 0; i < xLength; i++) {
            for (int j = 0; j < yLength; j++) {
                if (visit.contains(new Node(i,j))) {
                    bfs(i, j);
                    count++;
                }
            }
        }
    }


    static void bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        Node startNode = new Node(x, y);

        q.add(startNode);
        visit.add(startNode);

        int[][] directions = {
                {1, 0},
                {-1, 0},
                {0, -1},
                {0, 1}
        };

        while (!q.isEmpty()) {
            Node currentNode = q.remove();

            for (int[] arr : directions) {
                int dx = currentNode.x + arr[0];
                int dy = currentNode.y + arr[1];
                Node nextNode = new Node(dx, dy);
                if (!visit.contains(nextNode) && dx > -1 && dy > -1) {
                    q.add(nextNode);
                    visit.add(nextNode);
                }
            }
        }
    }


    static class Node {
        int x;
        int y;

        public Node(final int x, final int y) {
            this.x = x;
            this.y = y;
        }
    }
}
