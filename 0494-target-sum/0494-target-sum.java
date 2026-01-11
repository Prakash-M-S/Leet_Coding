class Solution {
    int[][] dp;

    // private int recurse(int i, int sum,int[] nums,int target) {
    //     if(sum==target&&i==nums.length)
    //     {
    //         return 1;
    //     }
    //     else if(i==nums.length) return 0;
    //     int idx=totalSum+sum;
    //     if(dp[i][idx]!=-1) return dp[i][idx];
        
    //     int add=recurse(i+1,sum+nums[i],nums,target);
    //     int sub=recurse(i+1,sum-nums[i],nums,target);
    //     return dp[i][idx]=add+sub;
    // }

    public int findTargetSumWays(int[] nums, int target) {
        int n =nums.length;
        int totalSum=0;

        for(int i=0;i<n;i++) totalSum+=nums[i];
        int[][] dp=new int[n+1][(2*totalSum)+1];
        // for (int i =0;i<nums.length;i++)
        //     Arrays.fill(dp[i], -1);
        // return recurse(0, 0, nums,target);
        if (Math.abs(target) > totalSum) return 0;
        dp[n][target+totalSum]=1;
        for(int i=n-1;i>=0;i--)
        {
            for(int s=-totalSum;s<=totalSum;s++)
            {
                int idx=s+totalSum;
                int ways=0;
                int add=s+nums[i];
                int sub=s-nums[i];
                if(add>=-totalSum&&add<=totalSum)
                {
                    ways+=dp[i+1][add+totalSum];
                }
                if(sub>=-totalSum&&sub<=totalSum)
                {
                    ways+=dp[i+1][sub+totalSum];
                }
                dp[i][idx]=ways
;            }
        }
        return dp[0][totalSum];
    }
}

