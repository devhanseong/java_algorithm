package bfs;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1012 {
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)))
        {
            int test = Integer.valueOf(br.readLine());
            for (int i = 0; i < test; i++) {
                int[][] graph = createGraph(br);
                boolean[][] visit = new boolean[graph.length][graph[0].length];
                int warm = 0;
                for (int x = 0; x < graph.length; x++) {
                    for (int y = 0; y < graph[0].length; y++) {
                        if (graph[x][y] == 1 && !visit[x][y]) {
                            bfs(x, y, graph, visit);
                            warm++;
                        }
                    }
                }
                bw.write(warm + "\n");
            }
            bw.flush();
        }
    }

    private static void bfs(int x, int y, int[][] graph, boolean[][] visit) {
        Queue<int[]> q = new ArrayDeque<>();
        visit[x][y] = true;
        q.offer(new int[]{x, y});

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int curX = cur[0];
            int curY = cur[1];

            for (int i = 0; i < dx.length; i++) {
                int nextX = curX + dx[i];
                int nextY = curY + dy[i];

                if (0 <= nextX && nextX < graph.length && 0 <= nextY && nextY < graph[0].length) {
                    if (graph[nextX][nextY] == 1 && !visit[nextX][nextY]) {
                        q.offer(new int[]{nextX, nextY});
                        visit[nextX][nextY] = true;
                    }
                }
            }
        }
    }

    private static int[][] createGraph(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.valueOf(st.nextToken());
        int n = Integer.valueOf(st.nextToken());
        int count = Integer.valueOf(st.nextToken());
        int[][] graph = new int[n][m];

        for (int j = 0; j < count; j++) {
            st = new StringTokenizer(br.readLine());
            int y = Integer.valueOf(st.nextToken());
            int x = Integer.valueOf(st.nextToken());
            graph[x][y] = 1;
        }
        return graph;
    }
}
