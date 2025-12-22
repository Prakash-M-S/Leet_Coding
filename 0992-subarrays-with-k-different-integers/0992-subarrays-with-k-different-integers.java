class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(k,nums)-atMost(k-1,nums);
    }
    private int atMost(int k,int nums[])
    {
        Map<Integer , Integer> map = new HashMap<>();
        int result = 0;
        int l =0;
        for(int r= 0;r<nums.length;r++)
        {
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size()>k)
            {
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0)
                {
                    map.remove(nums[l]);
                }
                l++;
            }
            result+=r -l +1;
        }
        return result;
    }
}