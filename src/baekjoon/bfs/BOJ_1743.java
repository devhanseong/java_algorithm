package baekjoon.bfs;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1743 {

    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.valueOf(st.nextToken());
            int m = Integer.valueOf(st.nextToken());
            int k = Integer.valueOf(st.nextToken());
            int maxSize = 0;

            int[][] graph = new int[n][m];
            boolean[][] visit = new boolean[n][m];

            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.valueOf(st.nextToken());
                int y = Integer.valueOf(st.nextToken());
                graph[x - 1][y - 1] = 1;
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (graph[i][j] == 1 && !visit[i][j]) {
                        int curSize = bfs(i, j, graph, visit);
                        maxSize = Integer.max(maxSize, curSize);
                    }
                }
            }
            bw.write(maxSize + "\n");
            bw.flush();
        }
    }

    private static int bfs(int i, int j, int[][] graph, boolean[][] visit) {
        Queue<int[]> q = new ArrayDeque<>();
        int maxSize = 1;
        q.offer(new int[]{i, j});
        visit[i][j] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int z = 0; z < dx.length; z++) {
                int nextX = cur[0] + dx[z];
                int nextY = cur[1] + dy[z];

                if (0 <= nextX && nextX < graph.length && 0 <= nextY && nextY < graph[0].length) {
                    if (graph[nextX][nextY] == 1 && !visit[nextX][nextY]) {
                        q.offer(new int[]{nextX, nextY});
                        visit[nextX][nextY] = true;
                        maxSize++;
                    }
                }
            }
        }
        return maxSize;
    }
}
