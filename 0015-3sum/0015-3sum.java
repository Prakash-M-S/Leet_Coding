class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int tar=nums[i];
            Map<Integer,Integer> map=new HashMap<>();
            
            for(int j=i+1;j<n;j++)
            {

                int need=-(tar+nums[j]);
                if(map.containsKey(need))
                {
                    list.add(Arrays.asList(tar,need,nums[j]));
                    while (j + 1 < n && nums[j] == nums[j + 1]) j++;
                }
                else
                {
                    map.put(nums[j],j);
                }
            }
        }
        return list;
            
    }        
}