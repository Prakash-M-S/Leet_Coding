class Solution {
    public int longestOnes(int[] nums, int k) {
        int start=0,end=0,zero=0;
        int n=nums.length;
        int max_length=0;
        for(end=0;end<n;end++)
        {
            if(nums[end]==0)
            {
                zero++;
            }
            while(zero>k)
            {
                if(nums[start]==0)
                {
                    zero--;
                }
                start++;
            }
            max_length=Math.max(max_length,end-start+1);
        }
        return max_length;
    }
}