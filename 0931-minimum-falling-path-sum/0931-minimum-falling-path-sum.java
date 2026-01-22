class Solution {
    Integer dp[][];
    int INF=(int)1e9;
    private int recurse(int i,int j,int[][] matrix)
    {
        if(i<0||j<0||j>=matrix[0].length) return INF;
        if(i==0) return matrix[i][j];
        if(dp[i][j]!=null) return dp[i][j];
        int left =recurse(i-1,j-1,matrix);
        int right =recurse(i-1,j+1,matrix);
        int top=recurse(i-1,j,matrix);
        dp[i][j] =Math.min(left,Math.min(right,top))+matrix[i][j];
        return dp[i][j];
    }
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int ans =Integer.MAX_VALUE;
        dp=new Integer[n][m];
        for(int curr=0;curr<m;curr++)
        {
        ans =Math.min(ans,recurse(n-1,curr,matrix));
        }
        return ans;
    }
}