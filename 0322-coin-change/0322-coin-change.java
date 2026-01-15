class Solution {
    public int coinChange(int[] coins, int amount) {
        int n =coins.length;
        int INF = (int)1e9;
        int dp[]=new int[amount+1];

            Arrays.fill(dp,INF);
        dp[0]=0;
        // Arrays.sort(coins);
        for(int i=1;i<=n;i++)
        {
            for(int amt=coins[i-1];amt<=amount;amt++)
            {
                 
                    dp[amt] =
                        Math.min(dp[amt],
                                 1 + dp[amt - coins[i - 1]]);
                
            }
        }
        return dp[amount]==INF?-1:dp[amount];

    }
}