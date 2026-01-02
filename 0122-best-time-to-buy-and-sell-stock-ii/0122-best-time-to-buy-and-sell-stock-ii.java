class Solution {
    // int dp[][];
    // private int recurse(int day,boolean hold,int[] prices,int n)
    // {
    //     if(day>=n)
    //     {
    //         return 0;
    //     }
    //     int max =Integer.MIN_VALUE;
    //     if(dp[day][hold?1:0]!=-1)
    //     {
    //         return dp[day][hold?1:0];
    //     }
    //     if(hold)
    //     {
    //         int take = +prices[day]+recurse(day+1,false,prices,n);
    //         int not_take = recurse(day+1,true,prices,n);
    //         max = Math.max(take,not_take);
    //     }
    //     else
    //     {
    //         int take = -prices[day]+recurse(day+1,true,prices,n);
    //         int not_take = recurse(day+1,false,prices,n);
    //         max = Math.max(take,not_take);
    //     }
    //     return dp[day][hold?1:0] = max;
    // }
    public int maxProfit(int[] prices) {
        int n =prices.length;
        int[][] dp=new int[n+1][2];
        for(int day =n-1;day>=0;day--)
        {
            dp[day][0]=Math.max(-prices[day]+dp[day+1][1],dp[day+1][0]);
            dp[day][1]=Math.max(prices[day]+dp[day+1][0],dp[day+1][1]);
        }
        return dp[0][0];
    }
}