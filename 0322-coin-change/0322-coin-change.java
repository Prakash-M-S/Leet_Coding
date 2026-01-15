class Solution {
    public int coinChange(int[] coins, int amount) {
        int n =coins.length;
        int INF = (int)1e9;
        int dp[][]=new int[n+1][amount+1];
        for(int a[]:dp)
        {
            Arrays.fill(a,INF);
        }
        for(int i=0;i<=n;i++) dp[i][0]=0;

        // Arrays.sort(coins);
        for(int i=1;i<=n;i++)
        {
            for(int amt=1;amt<=amount;amt++)
            {

                    dp[i][amt]=dp[i-1][amt];
                 
                if (coins[i - 1] <= amt && dp[i][amt - coins[i - 1]] != INF) {
                    dp[i][amt] =
                        Math.min(dp[i][amt],
                                 1 + dp[i][amt - coins[i - 1]]);
                }
            }
        }
        return dp[n][amount]==INF?-1:dp[n][amount];

    }
}