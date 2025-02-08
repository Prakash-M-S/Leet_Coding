class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int a=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>a)
            {
                profit+=prices[i]-a;
            }
            a=prices[i];
        }
        return profit;
    }
}