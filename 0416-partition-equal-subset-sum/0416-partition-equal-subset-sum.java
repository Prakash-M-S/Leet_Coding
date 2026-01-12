class Solution {
    // Boolean dp[][];
    // int tot;
    // int need;
    // private boolean recurse(int idx,int sum,int nums[],int n)
    // {
    //     if(sum==need)
    //     {
    //         return true;
    //     }
    //     if(idx==n||sum>need)
    //     {
    //         return false;
    //     }
    //     if(dp[idx][sum]!=null)
    //     {
    //         return dp[idx][sum];
    //     }
    //     dp[idx][sum]=recurse(idx+1,sum+nums[idx],nums,n)||recurse(idx+1,sum,nums,n);
    //     return dp[idx][sum];
    // }
    public boolean canPartition(int[] nums) {
        int tot=0;
        int n =nums.length;
        for(int a:nums) tot+=a;
        if((tot&1)!=0) return false;
        int need = tot/2;
        boolean dp[]=new boolean[need+1];
        dp[0]=true;
        // boolean dp[][]=new boolean[n+1][need+1];
        // dp[n][need]=true;
        for(int idx=n-1;idx>=0;idx--)
        {
            for(int sum=need;sum>=nums[idx];sum--)
            {
                int curr = sum-nums[idx];
                dp[sum]=dp[sum]|dp[curr];

            }
            }
            return dp[need];
        }
        }
        // return recurse(0,0,nums,n);
    
