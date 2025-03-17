class Solution {
    public int numSubarraysWithSum(int[] nums, int k) {
        int count=0;
        int ans=0;
        int n=nums.length;
        int prefix[]=new int[n+1];
        prefix[0]=1;
        for(int i=0;i<n;i++)
        {
            count+=nums[i];
            if(count>=k)
            {
                ans+=prefix[count-k];
            }            
            prefix[count]++;
        }
        return ans;
    }
}