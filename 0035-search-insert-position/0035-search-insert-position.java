class Solution {
    public int searchInsert(int[] nums, int t) {
        int f=0;
        int l=nums.length-1;
        int m=0;
        while(f<=l)
        {
            m=f+(l-f)/2;
            if(nums[m]==t)
            {
                return m;
            }
            else if(nums[m]>t)
            {
                l=m-1;
            }
            else
            {
                f=m+1;
            }
        }
        return f;
    }
}