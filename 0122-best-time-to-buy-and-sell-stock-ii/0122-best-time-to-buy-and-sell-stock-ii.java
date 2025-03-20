class Solution {
    int dp[][];
    public int recursion(int i,int n,int holding,int[] prices)
    {
        if(i==n)
        {
            return 0;
        }
        if(dp[i][holding]!=-1)
        {
            return dp[i][holding];
        }
        if(holding==0)
        {
            dp[i][holding]=Math.max(-prices[i]+recursion(i+1,n,1,prices),
            recursion(i+1,n,0,prices));
        }
        else
        {
            dp[i][holding]=Math.max(prices[i]+recursion(i+1,n,0,prices),
            recursion(i+1,n,1,prices));
        }
        return dp[i][holding];

    }
    public int maxProfit(int[] prices) {
        dp=new int[prices.length][2];
        for(int d[]:dp)
        {
        Arrays.fill(d,-1);
        }
        return recursion(0, prices.length, 0, prices);
       
    }
}