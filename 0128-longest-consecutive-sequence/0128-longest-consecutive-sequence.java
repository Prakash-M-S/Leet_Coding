class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        int max=0;
        for(int n:set)
        {
            if(!set.contains(n-1))
            {
                int curr=n;
                int streak=1;
                while(set.contains(++curr))
                {
                    streak++;
                }
                max=Math.max(streak,max);
            }
        }
        return max;

    }
}