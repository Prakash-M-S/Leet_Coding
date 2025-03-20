class Solution {
    int dp[][][];
    public int recursion(int i,int n,int holding,int[] prices,int cap)
    {
        if(i==n||cap==0)
        {
            return 0;
        }
        if(dp[i][holding][cap]!=-1)
        {
            return dp[i][holding][cap];
        }
        if (holding == 0) {
        if(cap>0)
        {
            dp[i][holding][cap]=Math.max(-prices[i]+recursion(i+1,n,1,prices,cap),
            recursion(i+1,n,0,prices,cap));
        }
         else {
                dp[i][holding][cap] = recursion(i + 1, n, 0, prices, cap);
            }
        }
        else
        {
            dp[i][holding][cap]=Math.max(prices[i]+recursion(i+1,n,0,prices,cap-1),
            recursion(i+1,n,1,prices,cap));
        }
        return dp[i][holding][cap];
    }
    public int maxProfit(int[] prices) {
        dp=new int[prices.length][2][3];
        for(int d[][]:dp)
        {
            for(int di[]:d)
            {
                Arrays.fill(di,-1);
            }
        }
        return recursion(0, prices.length, 0, prices,2);       
    }
}