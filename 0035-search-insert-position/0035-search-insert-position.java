class Solution {
    public int searchInsert(int[] nums, int t) {
        int f=0;
        int l=nums.length;
        int m=0;
        while(f<l)
        {
            m=f+(l-f)/2;
        if(nums[m]>=t)
            {
                l=m;
            }
            else
            {
                f=m+1;
            }
        }
        return f;
    }
}