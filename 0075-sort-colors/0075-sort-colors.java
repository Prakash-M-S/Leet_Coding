class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int j=0;
        int k=nums.length-1;
        while(j<=k)
        {
            if(nums[j]==0)
            {
                int t=nums[j];
                nums[j]=nums[i];
                nums[i]=t;
                i++;
                j++;
            }
            else if(nums[j]==1)
            {
                j++;
            }
            else if(nums[j]==2)
            {
                int t=nums[j];
                nums[j]=nums[k];
                nums[k]=t;
                k--;
            }
        }
    }

}