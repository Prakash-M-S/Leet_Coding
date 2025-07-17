class Solution {
    public int[] twoSum(int[] nums, int target) {
HashMap<Integer,Integer> m= new HashMap<>();
int c=0;
for(int i=0;i<nums.length;i++)
{
    c=target-nums[i];
    if(m.containsKey(c))
    {
        return new int[]{m.get(c),i};
    }
    m.put(nums[i],i);
}
return new int[] {};
    }
    
}
