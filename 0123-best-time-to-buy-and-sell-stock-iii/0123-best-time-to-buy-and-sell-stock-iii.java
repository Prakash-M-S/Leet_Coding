class Solution {
    int dp[][][];
    private int recurse(int day,int hold,int trans,int prices[],int n)
    {
        if(day==n)
        {
            return 0;
        }
        if(trans==0)
        {
            return 0;
        }
        if(dp[day][hold][trans]!=-1)
        {
            return dp[day][hold][trans]; 
        }
        if(hold ==1)
        {
            int sell=prices[day]+recurse(day+1,0,trans-1,prices,n);
            int not_sell = recurse(day+1,1,trans,prices,n);
            dp[day][hold][trans]=Math.max(sell,not_sell);
        }
        else
        {
            int buy = -prices[day]+recurse(day+1,1,trans,prices,n);
            int not_buy=recurse(day+1,0,trans,prices,n);
            dp[day][hold][trans]=Math.max(buy,not_buy);
        }
        return dp[day][hold][trans];
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        dp=new int[n][2][3];
        for(int arr[][]:dp)
        {
            for(int a[]:arr)
            {
                Arrays.fill(a,-1);
            }
        }
        return recurse(0,0,2,prices,n);
    }
}