class Solution {
    public int change(int amount, int[] coins) {
        int n =coins.length;
        int dp[][]=new int[n+1][amount+1];

        for (int i = 0; i <= n; i++)
            dp[i][0] = 1;
        for(int i=1;i<=n;i++)
        {
            for(int amt=1;amt<=amount;amt++)
            {
                    dp[i][amt]=dp[i-1][amt];
                if (coins[i - 1] <= amt) {
                    dp[i][amt] =
                       dp[i][amt]+
                                 dp[i][amt - coins[i - 1]];
                }
            }
        }
        return dp[n][amount];

    }
}