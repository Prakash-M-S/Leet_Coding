class Solution {
    public int maxProfit(int[] prices) {
        int daily=Integer.MAX_VALUE;
        int profit=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            daily=Math.min(daily,prices[i]);
            profit=Math.max(profit,prices[i]-daily);
        }
        return profit;
    }
}