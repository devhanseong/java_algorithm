package theory.numOfIslands;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/number-of-islands/
public class NumOfIsland {

    private int xMax;
    private int yMax;
    int[] dxs = {-1, 1, 0, 0};
    int[] dys = {0, 0, 1, -1};

    public int numIslands(char[][] grid) {
        int count = 0;
        xMax = grid.length;
        yMax = grid[0].length;
        boolean[][] visit = new boolean[xMax][yMax];

        for (int i = 0; i < xMax; i++) {
            for (int j = 0; j < yMax; j++) {
                if (grid[i][j] == '1' && !visit[i][j]) {
                    bfs(grid, visit, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private void bfs(char[][] grid, boolean[][] visit, int x, int y) {
        Queue<Node> q = new LinkedList<>();
        visit[x][y] = true;
        q.add(new Node(x, y));

        while (!q.isEmpty()) {
            Node currentNode = q.remove();

            for (int i = 0; i < 4; i++) {
                int dx = dxs[i];
                int dy = dys[i];

                int nextX = currentNode.x + dx;
                int nextY = currentNode.y + dy;

                if (isValid(nextX, nextY, xMax, yMax) && grid[nextX][nextY] == '1' && !visit[nextX][nextY]) {
                    q.add(new Node(nextX, nextY));
                    visit[nextX][nextY] = true;
                }
            }
        }
    }

    private boolean isValid(int nextX, int nextY, int xMax, int yMax) {
        return 0 <= nextX && nextX < xMax && 0 <= nextY && nextY < yMax;
    }

    class Node {
        int x;
        int y;

        Node (int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
