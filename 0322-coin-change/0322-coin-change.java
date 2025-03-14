class Solution {
    int recursion(int i,int[] coins,int amount,int dp[][])
    {
        if(i==0)
        {
            if(amount%coins[0]==0)
            {
                return amount/coins[0];
            }
            return (int)1e9;
        }
        if(dp[i][amount]!=-1)
        {
            return dp[i][amount];
        }
        int not_take=recursion(i-1,coins,amount,dp);
        int take=coins[i]<=amount?1+recursion(i,coins,amount-coins[i],dp):(int)1e9;
        
        
        return dp[i][amount]=Math.min(not_take,take);

    }
    public int coinChange(int[] coins, int amount) {
          int n=coins.length;
          int dp[][]=new int[n+1][amount+1];
          for(int[] d:dp)
          {
        Arrays.fill(d,-1);
          }
          int ans=recursion(coins.length-1,coins,amount,dp);
          if(ans<1e9)
          {
            return ans;
          }
          return -1;
    }
}