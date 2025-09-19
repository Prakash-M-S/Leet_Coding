class Solution {
    int climb(int[] cost , int i,int[] dp)
    {
        if(i>=cost.length)
        {
            return 0;
        }
        if(dp[i]!=-1)
        {
            return dp[i];
        }
        dp[i]=cost[i]+Math.min(climb(cost,i+1,dp),climb(cost,i+2,dp));
        return dp[i];
    }
    public int minCostClimbingStairs(int[] cost) {
        int dp[]=new int[cost.length+1];
        Arrays.fill(dp,-1);

        int s0=climb(cost,0,dp);
        int s1=climb(cost,1,dp);
        return Math.min(s0,s1);
    }
}