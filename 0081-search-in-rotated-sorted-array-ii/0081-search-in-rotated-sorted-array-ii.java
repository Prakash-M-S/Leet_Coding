class Solution {
    public boolean search(int[] nums, int target) {
        int n =nums.length;
        int l=0;
        int r=n-1;
        while(l<=r)
        {
            int m=l+(r-l)/2;
            if(nums[m]==target) return true;
            if(nums[l]==nums[r]&&nums[m]==nums[l])
            {
                l++;r--;
            }
            else
            {
                if(nums[m]>=nums[l])
                {
                    if(target>=nums[l]&&target<=nums[m]) r=m-1;
                    else    l=m+1;
                }
                else
                {
                    if(target<=nums[r]&&target>=nums[m]) l=m+1;
                    else r=m-1;
                }
            }
        }
        return false;
    }
}