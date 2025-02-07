class Solution {
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int matrix[][]=new int[n][m];
        int row=0;
        int col=0;
        matrix[row][col]=grid[row][col];
        for(col=1;col<m;col++)
        {
            matrix[row][col]=matrix[row][col-1]+grid[row][col];
        }
        col=0;
        for(row=1;row<n;row++)
        {
            matrix[row][col]=matrix[row-1][col]+grid[row][col];
        }
        for(row=1;row<n;row++)
        {
            for(col=1;col<m;col++)
            {
                matrix[row][col]=Math.min(matrix[row-1][col],matrix[row][col-1])+grid[row][col];
            }
        }
        return matrix[n-1][m-1];
    }
}