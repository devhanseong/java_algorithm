package baekjoon.bfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2178 {

    private static int[] dx = {0, 0, 1, -1};
    private static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int[][] graph = createGraph(br);
            int n = graph.length;
            int m = graph[0].length;

            boolean[][] visit = new boolean[n][m];
            int shortestPath = bfs(graph, visit, n, m);
            bw.write(shortestPath + "\n");
            bw.flush();
        }
    }

    private static int bfs(int[][] graph, boolean[][] visit, int n, int m) {
        Queue<Node> q = new ArrayDeque<>();
        q.offer(new Node(0, 0, 1));
        visit[0][0] = true;

        while (!q.isEmpty()) {
            Node curNode = q.poll();
            if (curNode.x == n - 1 && curNode.y == m - 1) {
                return curNode.path;
            }
            for (int i = 0; i < dx.length; i++) {
                int nextX = curNode.x + dx[i];
                int nextY = curNode.y + dy[i];

                if (0 <= nextX && nextX < n && 0 <= nextY && nextY < m) {
                    if (graph[nextX][nextY] == 1 && !visit[nextX][nextY]) {
                        q.offer(new Node(nextX, nextY, curNode.path + 1));
                        visit[nextX][nextY] = true;
                    }
                }
            }
        }
        return -1;
    }

    private static int[][] createGraph(BufferedReader br) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        int m = Integer.valueOf(st.nextToken());

        int[][] graph = new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] strs = br.readLine().split("");
            for (int j = 0 ; j < m; j++) {
                graph[i][j] = Integer.valueOf(strs[j]);
            }
        }
        return graph;
    }

    static class Node {
        int x;
        int y;
        int path;

        public Node(final int x, final int y, final int path) {
            this.x = x;
            this.y = y;
            this.path = path;
        }
    }
}
