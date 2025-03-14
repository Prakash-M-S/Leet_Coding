class Solution {
    public int coinChange(int[] coins, int amount) {
          int n = coins.length;
        int[][] dp = new int[n][amount + 1];


        for (int j = 0; j <= amount; j++) {
            if (j % coins[0] == 0) dp[0][j] = j / coins[0];
            else dp[0][j] = (int) 1e9; 
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= amount; j++) {
                int not_take = dp[i - 1][j];
                int take = (coins[i] <= j) ? 1 + dp[i][j - coins[i]] : (int) 1e9;
                dp[i][j] = Math.min(not_take, take);
            }
        }

        int ans = dp[n - 1][amount];
        return (ans >= (int) 1e9) ? -1 : ans;
    }
}