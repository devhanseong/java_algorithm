package bfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1926 {

    private static final int[] dx = {0, 0, 1, -1};
    private static final int[] dy = {1, -1, 0, 0};
    private static int n = 0;
    private static int m = 0;

    public static void main(String[] args) throws Exception {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.valueOf(st.nextToken());
            m = Integer.valueOf(st.nextToken());

            int[][] graph = createGraph(br);
            boolean[][] visit = new boolean[n][m];
            int count = 0;
            int maxSize = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m ; j++) {
                    if (graph[i][j] == 1 && !visit[i][j]) {
                        maxSize = Math.max(maxSize, bfs(graph, visit, i, j));
                        count++;
                    }
                }
            }
            bw.write(count + "\n");
            bw.write(maxSize + "\n");
            bw.flush();
        }
    }

    private static int bfs(int[][] graph, boolean[][] visit, int i, int j) {
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[] {i, j});
        visit[i][j] = true;
        int curSize = 1;

        while (!q.isEmpty()) {
            int[] cur = q.poll();

            for (int x = 0; x < dx.length; x++) {
                int nextX = cur[0] + dx[x];
                int nextY = cur[1] + dy[x];

                if (0 <= nextX && nextX < n && 0 <= nextY && nextY < m) {
                    if (graph[nextX][nextY] == 1 && !visit[nextX][nextY]) {
                        q.offer(new int[] {nextX, nextY});
                        visit[nextX][nextY] = true;
                        curSize++;
                    }
                }
            }
        }
        return curSize;
    }

    private static int[][] createGraph(BufferedReader br) throws Exception {
        int[][] graph = new int[n][m];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                graph[i][j] = Integer.valueOf(st.nextToken());
            }
        }
        return graph;
    }


}
