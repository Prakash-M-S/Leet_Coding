class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        if(n==1)
        {
            return 0;
        }
        int left=0;
        int right = n-1;
        while(left<right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid+1]>nums[mid])
            {
                left=mid+1;
            }
            else
            {
                right=mid;
            }
        }
        return left;
    }
}