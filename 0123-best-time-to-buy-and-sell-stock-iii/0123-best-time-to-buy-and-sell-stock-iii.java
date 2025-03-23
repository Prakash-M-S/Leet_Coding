class Solution {
    
    
    
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][][] dp=new int[n+1][2][3];
        for(int i=n-1;i>=0;i--)
        {
            for(int holding =0;holding<=1;holding++)
            {
                for(int cap=1;cap<=2;cap++)
                {
                    if (holding == 0) {
            dp[i][holding][cap] = Math.max(-prices[i] + dp[i + 1][1][cap],
                                          dp[i + 1][0][cap]);
        } else {
            dp[i][holding][cap] = Math.max(prices[i] + dp[i + 1][0][cap-1],
                                          dp[i + 1][1][cap]);
        }
                }
            }
        }
        return dp[0][0][2];
    }
}