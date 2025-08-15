class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int running=0;
        int count=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            running+=nums[i];
            if(map.containsKey(running-k))
            {
                count+=map.get(running-k);
            }
            map.put(running,map.getOrDefault(running,0)+1);
        }
        return count;
    }
}