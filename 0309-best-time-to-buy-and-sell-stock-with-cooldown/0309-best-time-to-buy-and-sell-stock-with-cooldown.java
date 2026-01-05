class Solution {
    int dp[][][];
    private int recurse(int day, int hold,int cool,int prices[],int n)
    {
        if(day==n)
        {
            return 0;
        }
        if(dp[day][hold][cool]!=-1)
        {
            return dp[day][hold][cool];
        }
        if(hold==0)
        {
            int buy=Integer.MIN_VALUE;
            if(cool==0)
            {
                buy=-prices[day]+recurse(day+1,1,0,prices,n);
            }
            int not_buy = recurse(day+1,0,0,prices,n);
            return dp[day][hold][cool]=Math.max(buy,not_buy);
        }
        else
        {
            int sell=prices[day]+recurse(day+1,0,1,prices,n);
            int not_sell=recurse(day+1,1,0,prices,n);
            return dp[day][hold][cool]=Math.max(sell,not_sell);
        }


    }
    public int maxProfit(int[] prices) {
        int n =prices.length;
        dp=new int[n][2][2];
        for(int arr[][]:dp)
        {
            for(int a[]:arr)
            {
                Arrays.fill(a,-1);
            }
        }
        return recurse(0,0,0,prices,n);
    }
}