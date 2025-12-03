class Solution {
    // int dp[][];
    // public int recurse(int i,int j,int n,int m,String s,String t)
    // {
    //     if(j==m)
    //     {
    //         return 1;
    //     }
    //     else if(i==n)
    //     {
    //         return 0;
    //     }
    //     if(dp[i][j]!=-1)
    //     {
    //         return dp[i][j];
    //     }
    //     if(s.charAt(i)==t.charAt(j))
    //     {

    //         dp[i][j]=recurse(i+1,j+1,n,m,s,t)+recurse(i+1,j,n,m,s,t);
    //     }
    //     else
    //     {
    //         dp[i][j]=recurse(i+1,j,n,m,s,t);
    //     }
    //     return dp[i][j];
        
    // }
    public int numDistinct(String s, String t) {
        int n =s.length();
        int m=t.length();
        int dp[][]=new int[n+1][m+1];
        // for(int arr[]:dp)
        // {
        //     Arrays.fill(arr,-1);
        // }
        if(m>n)
        {
            return 0;
        }
        for (int i = 0; i <= n; i++) dp[i][0] = 1;


        for(int i =1;i<=n;i++)
        {
            for(int j = 1;j<=m;j++)
            {
                if(s.charAt(i-1)==t.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][m];
        
    }
}