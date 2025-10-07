class Solution {
    public int maximalSquare(char[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int maxSideLength=0;
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<m;i++)
        {
            for(int j =0;j<n;j++)
            {
                if(matrix[i][j]=='0')
                {
                    dp[i+1][j+1]=0;
                }
                else
                {
                    dp[i+1][j+1]=Math.min(dp[i][j],Math.min(dp[i][j+1],dp[i+1][j]))+1;
                }
                maxSideLength = Math.max(maxSideLength, dp[i + 1][j + 1]);
            }
        }
        return maxSideLength*maxSideLength;
    }
}