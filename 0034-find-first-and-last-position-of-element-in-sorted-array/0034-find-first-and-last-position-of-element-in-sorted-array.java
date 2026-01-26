class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int l=0;
        int r=n;
        while(l<r)
        {
            int m=l+(r-l)/2;
            if(nums[m]>=target)
            {
                r=m;
            }
            else
            {
                l=m+1;
            }
        }
        int ans[]=new int[2];
        if(l>=0&&l<n)
        ans[0]=(nums[l]==target)?l:-1;
        else ans[0]=-1;
        l=0;
        r=n;
        while(l<r)
        {
            int m=l+(r-l)/2;
            if(nums[m]>target)
            {
                r=m;
            }
            else
            {
                l=m+1;
            }
        }
        ans[1]=(l!=0&&nums[l-1]==target)?l-1:-1;
        return ans;
        
    }
}