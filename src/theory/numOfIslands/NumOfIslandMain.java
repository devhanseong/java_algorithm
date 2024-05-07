package theory.numOfIslands;

public class NumOfIslandMain {

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        NumOfIsland numOfIsland = new NumOfIsland();
        int i = numOfIsland.numIslands(grid);
        System.out.println(i);
    }
}
