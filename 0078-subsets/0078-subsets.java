class Solution {
    public void recursion(int nums[],List<List<Integer>> list,List<Integer> sub,int i,int n)
    {
        
        if(i==n)
        {
            list.add(new ArrayList<>(sub));
            return;
        }
                recursion(nums,list,sub,i+1,n);
                sub.add(nums[i]);
                recursion(nums,list,sub,i+1,n);
                sub.remove(sub.size()-1);
        
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> sub=new ArrayList<>();
        recursion(nums,list,sub,0,nums.length);
        return list;
    }
}