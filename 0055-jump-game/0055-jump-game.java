class Solution {
    public boolean canJump(int[] nums) {
      int max=0;
      int n=nums.length;
      for(int row=0;row<n;row++)
      {
        if(row>max)
        {
            return false;
        }
        max=Math.max(row+nums[row],max);
        if(max>=n-1)
        {
            return true;
            
        }
      }
      return true;  
    }
}