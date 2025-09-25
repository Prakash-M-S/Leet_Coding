class Solution {
    int dp[];
    private int recurse(int n)
    {
        if(n<=1){
            return n;
        }
        if(n==2)
        {
            return 1;
        }
        if(dp[n]!=0)
        {
            return dp[n];
        }
        dp[n]= recurse(n-1)+recurse(n-2)+recurse(n-3);
        return dp[n];
    }
    public int tribonacci(int n) {
        dp=new int[n+1];
        return recurse(n);
    }
}