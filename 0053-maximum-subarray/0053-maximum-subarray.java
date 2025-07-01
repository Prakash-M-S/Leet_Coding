class Solution {
    public int maxSubArray(int[] nums) {
        int res=Integer.MIN_VALUE;
        
        int running=0;
        for(int a:nums)
        {
            running+=a;
            res=Math.max(running,res);
            if(running<0) running =0;
        }
        return res;
    }
}