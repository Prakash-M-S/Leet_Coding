class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        int max=0;
        for(int num:nums)
        {
            int idx=Collections.binarySearch(list,num);
            if(idx<0)
            {
                idx=-idx-1;
            }
            if(idx==list.size())
            {
                list.add(num);
            }
            else 
            {
                list.set(idx,num);
            }
            max=Math.max(max,list.size());
             
        }
        return max;
        
    }
}