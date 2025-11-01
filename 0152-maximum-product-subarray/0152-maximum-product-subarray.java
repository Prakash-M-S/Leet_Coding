class Solution {
    public int maxProduct(int[] nums) {
        int left=1;
        int right =1;
        int max=Integer.MIN_VALUE;
        int n =nums.length;
        for(int i=0;i<n;i++)
        {
            if(left==0)
            {
                left=1;
            }
            if(right==0)
            {
                right=1;
            }
            left*=nums[i];
            right*=nums[n-i-1];
            max=Math.max(max,Math.max(left,right));
        }
        return max;
    }
}