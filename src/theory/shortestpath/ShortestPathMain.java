package theory.shortestpath;

public class ShortestPathMain {

    public static void main(String[] args) {
        ShortestPath solution = new ShortestPath();
        int[][] grid = {
                {0, 0, 0},
                {1, 1, 0},
                {1, 1, 0}
        };
        int result = solution.shortestPathBinaryMatrix(grid);
        System.out.println(result);
    }
}
