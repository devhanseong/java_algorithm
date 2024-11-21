package baekjoon.bfs;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ_2468 {

    private static final int[] dx = {0, 0, 1, -1};
    private static final int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.valueOf(br.readLine());
            int[][] graph = setUpGraph(br, N); // 한번 초기화 후 계속 사용

            int maxHeight = findMax(graph);
            int maxOfSafeArea = 0;

            // O(n*n*n)
            for (int height = 0; height <= maxHeight; height++) {
                // 물의 높이가 변할 때 마다 계속 초기화해주어야한다.
                boolean[][] visit = new boolean[N][N];
                int countOfSafeArea = 0;
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        // 탐색하지 않고, 물의 높이보다 높으면 탐색 시작
                        if (!visit[i][j] && graph[i][j] > height) {
                            bfs(height, graph, visit, i, j);
                            countOfSafeArea++;
                        }
                    }
                }
                maxOfSafeArea = Integer.max(maxOfSafeArea, countOfSafeArea);
            }
            bw.write(maxOfSafeArea + "\n");
            bw.flush();
        }
    }

    private static void bfs(int height, int[][] graph, boolean[][] visit, int x, int y) {
        Deque<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{x, y});
        visit[x][y] = true;
        int N = graph.length;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = cur[0] + dx[i];
                int nextY = cur[1] + dy[i];

                if (0 <= nextX && nextX < N && 0 <= nextY && nextY < N) {
                    if (!visit[nextX][nextY] && graph[nextX][nextY] > height) {
                        q.offer(new int[] {nextX, nextY});
                        visit[nextX][nextY] = true;
                    }
                }
            }
        }
    }

    private static int[][] setUpGraph(BufferedReader br, int len) throws IOException {
        int[][] graph = new int[len][len];
        for (int i = 0; i < len; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < len; j++) {
                graph[i][j] = Integer.valueOf(st.nextToken());
            }
        }
        return graph;
    }

    private static int findMax(int[][] graph) {
        int len = graph.length;
        int max = 0;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                max = Integer.max(max, graph[i][j]);
            }
        }
        return max;
    }
}
