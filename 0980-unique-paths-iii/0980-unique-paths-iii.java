class Solution {
    private static final int[][] DIRS = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

    public int uniquePathsIII(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int rows = grid.length;
        int cols = grid[0].length;
        if (rows == 1 && cols == 1) {
            return 0;
        }
        int[] start = null;
        int[] end = null;
        int nonObstacleSquares = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                switch (grid[i][j]) {
                    case 1:
                        if (start != null) {
                            return 0;
                        }
                        start = new int[] { i, j };
                        nonObstacleSquares++;
                        break;
                    case 2:
                        if (end != null) {
                            return 0;
                        }
                        end = new int[] { i, j };
                        nonObstacleSquares++;
                        break;
                    case 0:
                        nonObstacleSquares++;
                        break;
                }
            }
        }
        if (start == null || end == null) {
            return 0;
        }

        return dfsHelper(grid, start[0], start[1], nonObstacleSquares);
    }

    private int dfsHelper(int[][] grid, int row, int col, int nonObstacleSquares) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == -1
                || grid[row][col] == 3) {
            return 0;
        }
		
        if (grid[row][col] == 2) {
            return nonObstacleSquares == 1 ? 1 : 0;
        }

        int preVal = grid[row][col];
        grid[row][col] = 3;
        int pathCount = 0;
        for (int[] d : DIRS) {
            pathCount += dfsHelper(grid, row + d[0], col + d[1], nonObstacleSquares - 1);
        }
        grid[row][col] = preVal;
        return pathCount;
    }
}