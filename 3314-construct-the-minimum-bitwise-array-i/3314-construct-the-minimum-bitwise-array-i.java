class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n=nums.size();
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if((nums.get(i)&1)==0)
            {
                ans[i]=-1;
            }
            else
            {
                int curr=(int)Math.floor(nums.get(i)/2);
                for(int k=curr;k<=nums.get(i);k++)
                {
                    if((k|(k+1))==nums.get(i))
                    {
                        ans[i]=k;
                        break;
                    }
                }
            }
        }
        return ans;
    }
}