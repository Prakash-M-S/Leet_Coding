class Solution {
    public void recursion(int nums[],List<List<Integer>> list,List<Integer> sub,int start,int n)
    {
        
        list.add(new ArrayList<>(sub));
        for (int i = start; i < n; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;
                sub.add(nums[i]);
                recursion(nums,list,sub,i+1,n);
                sub.remove(sub.size()-1);
        }
    }
    
        
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> sub=new ArrayList<>();
        recursion(nums,list,sub,0,nums.length);
        return list;
    }
}