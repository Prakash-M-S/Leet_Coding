class Solution {
    // private int recurse(int n)
    // {
    //     if(n<=1){
    //         return n;
    //     }
    //     if(n==2)
    //     {
    //         return 1;
    //     }
    //     if(dp[n]!=0)
    //     {
    //         return dp[n];
    //     }
    //     dp[n]= recurse(n-1)+recurse(n-2)+recurse(n-3);
    //     return dp[n];
    // }
    public int tribonacci(int n) {
        if(n<=1)
        {
            return n;
        }
        if(n==2)
        {
            return 1;
        }
        int dp[]=new int[n+1];

        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        for(int i=3;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
}