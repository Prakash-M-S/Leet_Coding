class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int count=0;
        int prefix=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            prefix+=nums[i]&1;
            count+=map.getOrDefault(prefix-k,0);
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        return count;
    }
}