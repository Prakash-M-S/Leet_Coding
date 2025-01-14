class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int prefix[]=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            prefix[i]=prefix[i-1]+nums[i];
        }
        int left=0;
        int right=prefix[n-1];
        for(int i=0;i<n;i++)
        {
            if(left==right-prefix[i])
            {
                return i;
            }
            left=prefix[i];
        }
        return -1;
    }
}