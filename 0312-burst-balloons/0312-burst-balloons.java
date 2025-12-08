class Solution {
    // int[][] dp;
    // int[] val;
    public int maxCoins(int[] nums) {
         int n = nums.length;

        int[] val = new int[n + 2];
        val[0] = 1;
        val[n + 1] = 1;

        for (int i = 1; i <= n; i++) {
            val[i] = nums[i - 1];
        }

        int[][] dp = new int[n + 2][n + 2];

        for (int i = n; i >= 1; i--) {
            for (int j = i; j <= n; j++) {

                int best = 0;

                for (int k = i; k <= j; k++) {

                    int coins =
                        val[i - 1] * val[k] * val[j + 1] +
                        dp[i][k - 1] +
                        dp[k + 1][j];

                    best = Math.max(best, coins);
                }

                dp[i][j] = best;
            }
        }

        return dp[1][n];   
    }
}
    // private int recurse(int i, int j) {  
    //     if (i > j) return 0;  

    //     if (dp[i][j] != -1) return dp[i][j];
    //     int best = 0;
    //     for (int k = i; k <= j; k++) {
    //         int coins =
    //             val[i - 1] * val[k] * val[j + 1]    
    //             + recurse(i, k - 1)                 
    //             + recurse(k + 1, j);                 

    //         best = Math.max(best, coins);
    //     }

    //     return dp[i][j] = best;
//     }
// }
