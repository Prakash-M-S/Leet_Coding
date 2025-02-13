class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=0;
        for(i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                break;
            }
        }
        if(i>=0)
        {
            int swap=i+1;
            for(int j=i+1;j<n;j++)
            {
                if(nums[j]>nums[i])
                {
                    swap=j;
                }
            }
            int temp=nums[i];
            nums[i]=nums[swap];
            nums[swap]=temp;

        }
                
        int start=i+1;
        int end=n-1;
        while(start<end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        
    }
}