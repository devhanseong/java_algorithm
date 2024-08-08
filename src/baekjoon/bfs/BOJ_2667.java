package baekjoon.bfs;

import java.io.*;
import java.util.*;

public class BOJ_2667 {

    private static String[][] graph; // 그래프, 0과 1로만 주어지기 때문에 그냥 문자열로한다.
    private static boolean[][] visit; // 탐색 체크
    private static int n; // 그래프 길이
    private static int[] dx = {0, 0, 1, -1}; // 세로 축 이동방향
    private static int[] dy = {1, -1,0, 0}; // 가로 축 이동방향


    public static void main(String[] args) throws Exception{
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int complexCount = 0;
            List<Integer> complexSizes = new ArrayList<>();

            n = Integer.valueOf(br.readLine());
            graph = new String[n][n];
            visit = new boolean[n][n];

            // 그래프 초기화 O(n**2)
            generateGraph(br);

            // 탐색 O(n**2)
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n ; j++) {
                    if (!visit[i][j] && "1".equals(graph[i][j])) {
                        complexCount++;
                        bfs(i, j, complexSizes);
                    }
                }
            }
            
            StringBuilder sb = new StringBuilder(complexCount + "\n");
            Collections.sort(complexSizes); // 오름차순 정렬
            for (Integer size : complexSizes) {
                sb.append(size + "\n");
            }
            
            bw.write(sb.toString());
            bw.flush();
        }
    }

    private static void bfs(int i, int j, List<Integer> complexSizes) {
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{i, j});
        visit[i][j] = true;
        int curSize = 1;

        while (!q.isEmpty()) {
            int[] curNode = q.poll();
            int curX = curNode[0];
            int curY = curNode[1];

            for (int d = 0; d < 4; d++) {
                int nextX = curX + dx[d];
                int nextY = curY + dy[d];

                if (0 <= nextX && nextX < n && 0 <= nextY && nextY < n) {
                    if ("1".equals(graph[nextX][nextY]) && !visit[nextX][nextY]) {
                        q.offer(new int[]{nextX, nextY});
                        visit[nextX][nextY] = true;
                        curSize++;
                    }
                }
            }
        }
        complexSizes.add(curSize);
    }

    private static void generateGraph(BufferedReader br) throws Exception {
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split("");
            for (int j = 0; j < n ; j++) {
                graph[i][j] = input[j];
            }
        }
    }
}
