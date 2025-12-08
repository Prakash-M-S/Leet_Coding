class Solution {
    int[][] dp;
    int[] val;
    public int maxCoins(int[] nums) {
        int n = nums.length;
        val = new int[n + 2];
        val[0] = 1;
        val[n + 1] = 1;

        for (int i = 1; i <= n; i++) {
            val[i] = nums[i - 1];
        }

        dp = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return recurse(1, n);   
    }
    private int recurse(int i, int j) {  
        if (i > j) return 0;  

        if (dp[i][j] != -1) return dp[i][j];
        int best = 0;
        for (int k = i; k <= j; k++) {
            int coins =
                val[i - 1] * val[k] * val[j + 1]    
                + recurse(i, k - 1)                 
                + recurse(k + 1, j);                 

            best = Math.max(best, coins);
        }

        return dp[i][j] = best;
    }
}
