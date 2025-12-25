class Solution {
    int dp[][][];
    private int recurse(int i,int j,int pre[][],int k,int n ,int m)
    {
        if(i>=n||j>=m)
        {
            return 0;
        }
        if(k==1)
        {
            return pre[i][j]>0?1:0;
        }
        if(dp[i][j][k]!=-1)
        {
            return dp[i][j][k];
        }
        int ways=0;
        for(int r=i+1;r<n;r++)
        {
            if(pre[i][j]-pre[r][j]>0)
            {
                ways=(ways+recurse(r,j,pre,k-1,n,m)%1000000007)%1000000007;
            }
        }
        for(int c=j+1;c<m;c++)
        {
            if(pre[i][j]-pre[i][c]>0)
            {
                ways=(ways+recurse(i,c,pre,k-1,n,m)%1000000007)%1000000007;
            }
        }
        return dp[i][j][k]=ways%1000000007;
        
    }
    public int ways(String[] pizza, int k) {
        int n =pizza.length;
        int m =pizza[0].length();
        char grid[][]=new char[n][m];
        for(int i=0;i<n;i++)
        {
            grid[i]=pizza[i].toCharArray();
        }
        int pre[][]=new int[n+1][m+1];
        for(int i =n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--)
            {
                pre[i][j]=(grid[i][j]=='A'?1:0)+pre[i+1][j]+pre[i][j+1]-pre[i+1][j+1];
            }
        }
        dp=new int[n][m][k+1];
        for(int arr[][]:dp)
        {
            for(int b[]:arr)
            {
                Arrays.fill(b,-1);
            }
        }
        return recurse(0,0,pre,k,n,m);
    }
}