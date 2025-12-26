class Solution {
    long dp[];
    private long recurse(int i,int k,int n,int arr[])
    {
        if(i>=n)
        {
            return 0;
        }
        if(dp[i]!=-1)
        {
            return dp[i];
        }
        long max =0L;
        long sub_max=0L;
        for(int a=i;a<i+k&&a<n;a++)
        {
            if(sub_max<arr[a]) sub_max=(long)arr[a];
            long cost =(sub_max*(a-i+1))+recurse(a+1,k,n,arr);
            max=Math.max(cost,max);
        } 
        return dp[i]=max;
    }
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n =arr.length;
        dp=new long[n];
        Arrays.fill(dp,-1);
        return (int)recurse(0,k,n,arr);
    }
}