class Solution {
    Boolean dp[][];
    public boolean recursion(int nums[],int n,int i,int need)
    {
        if(need==0) return true;
        if(i>=n) return false;
    if(dp[i][need]!=null) return dp[i][need];
        boolean include=(nums[i]<=need)&&recursion(nums,n,i+1,need-nums[i]);
        dp[i][need]=include||recursion(nums,n,i+1,need);
        return dp[i][need];
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        int n=nums.length;
       
        for(int a:nums)
        {
            sum+=a;
        }
        if((sum&1)==1)
        {
            return false;
        }
         dp=new Boolean[n][sum+1];
        int need=sum/2;
        return recursion(nums,n,0,need);
    }
}