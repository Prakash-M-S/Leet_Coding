class Solution {
    public int findDuplicate(int[] nums) {
       int slow=nums[0];
        int fast = nums[0];
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);
        int slow_1=nums[0];
        while(slow_1!=slow)
            {
                slow=nums[slow];
                slow_1=nums[slow_1];
            }
        return slow;
        
    }
}