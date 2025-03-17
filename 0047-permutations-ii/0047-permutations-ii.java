class Solution {
    public void permutation(int[] nums,List<Integer> ds,List<List<Integer>> list, boolean[] freq)
    {
        if(ds.size()==nums.length)
        {
            list.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if (i > 0 && nums[i] == nums[i - 1] && !freq[i - 1]) continue;

            if(!freq[i])
            {
                freq[i]=true;
                ds.add(nums[i]);
                permutation(nums,ds,list,freq);
                ds.remove(ds.size()-1);
                freq[i]=false;


            }

        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
         List<List<Integer>> lis=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        boolean freq[]=new boolean[nums.length];
        permutation(nums,ds,lis,freq);
        return lis;
    }
}