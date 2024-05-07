package theory.shortestpath;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/shortest-path-in-binary-matrix/
public class ShortestPath {

    int n;
    int[] dx = {1, 1, 1, -1, -1, -1, 0, 0};
    int[] dy = {0, -1, 1, -1, 0, 1, -1, 1};

    public int shortestPathBinaryMatrix(int[][] grid) {
        n = grid.length;
        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) {
            return -1;
        }

        boolean[][] visit = new boolean[n][n];
        return bfs(grid, visit);
    }

    public int bfs(int[][] grid, boolean[][] visit) {
        // x, y, path
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0, 1});
        visit[0][0] = true;
        int shortestPath = -1;

        while (!q.isEmpty()) {
            int[] arr = q.remove();

            int x = arr[0];
            int y = arr[1];
            int path = arr[2];

            if (x == n - 1 && y == n - 1) {
                shortestPath = path;
                break;
            }

            for (int d = 0; d < 8; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];
                
                if (isValid(nx, ny) && grid[nx][ny] == 0 && !visit[nx][ny]) {
                    q.add(new int[]{nx, ny, path + 1});
                    visit[nx][ny] = true;
                }
            }
        }
        return shortestPath;
    }

    public boolean isValid(int nx, int ny) {
        return 0 <= nx && nx < n && 0 <= ny && ny < n;
    }

}
