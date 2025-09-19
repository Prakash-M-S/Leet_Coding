class Solution {
    int []dp;
    private int climb(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else if(n==2)
        {
            return 2;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        dp[n]=climb(n-1)+climb(n-2);
        return dp[n];
    }
    public int climbStairs(int n) {
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        return climb(n);
    }
}