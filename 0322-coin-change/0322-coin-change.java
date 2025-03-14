class Solution {
    public int coinChange(int[] coins, int amount) {
          int n=coins.length;
          int dp[]=new int[amount+1];
          Arrays.fill(dp,(int)1e9);
          dp[0]=0;
          for(int coin:coins)
          {
            for(int j=coin;j<=amount;j++)
            {
                dp[j]=Math.min(dp[j],1+dp[j-coin]);
            }
          }
          int ans=dp[amount];
          if(ans<1e9)
          {
            return ans;
          }
          return -1;
    }
}