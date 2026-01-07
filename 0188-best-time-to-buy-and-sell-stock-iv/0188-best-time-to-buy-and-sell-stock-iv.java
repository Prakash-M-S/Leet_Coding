class Solution{
    int dp[][][];
    // private int recurse(int day,int hold,int k,int prices[],int n)
    // {
    //     if(day==n||k==0)  return 0;
    //     if(dp[day][hold][k]!=-1)
    //     {
    //         return dp[day][hold][k];
    //     }
    //     if(hold==1)
    //     {
    //         int sell=prices[day]+recurse(day+1,0,k-1,prices,n);
    //         int not_sell=recurse(day+1,1,k,prices,n);
    //         dp[day][hold][k]=Math.max(sell,not_sell);
    //     }
    //     else
    //     {
    //         int buy=-prices[day]+recurse(day+1,1,k,prices,n);
    //         int not_buy=recurse(day+1,0,k,prices,n);
    //         dp[day][hold][k]=Math.max(buy,not_buy);
    //     }
    //     return dp[day][hold][k];
    // }
    public int maxProfit(int k, int[] prices) {
    int n=prices.length;
    dp=new int[n+1][2][k+1];
    // for(int arr[][]:dp)
    // {
    //     for(int d[]:arr)
    // Arrays.fill(d,-1);
    // }
    // return recurse(0,0,k,prices,n);
    for(int day=n-1;day>=0;day--)
    {
        for(int lim=1;lim<=k;lim++)
        {
            dp[day][0][lim]=Math.max(-prices[day]+dp[day+1][1][lim],dp[day+1][0][lim]);
            dp[day][1][lim]=Math.max(prices[day]+dp[day+1][0][lim-1],dp[day+1][1][lim]);
        }
    }
    return dp[0][0][k];

    }
}