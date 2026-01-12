class Solution {
    Boolean dp[][];
    int tot;
    int need;
    private boolean recurse(int idx,int sum,int nums[],int n)
    {
        if(sum==need)
        {
            return true;
        }
        if(idx==n||sum>tot)
        {
            return false;
        }
        if(dp[idx][sum]!=null)
        {
            return dp[idx][sum];
        }
        dp[idx][sum]=recurse(idx+1,sum+nums[idx],nums,n)||recurse(idx+1,sum,nums,n);
        return dp[idx][sum];
    }
    public boolean canPartition(int[] nums) {
     tot=0;
        int n =nums.length;
        for(int a:nums) tot+=a;
        if((tot&1)!=0) return false;
        dp=new Boolean[n][tot+1];
        need = tot/2;
        return recurse(0,0,nums,n);
    }
}