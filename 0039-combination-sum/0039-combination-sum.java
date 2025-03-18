class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> com=new ArrayList<>();
        backTrack(list,com,0,target,candidates);
        return list;
    }
    public void backTrack(List<List<Integer>> list,List<Integer> com,int start,int target,int candidates[])
    {
        if(target==0)
        {
            list.add(new ArrayList<>(com));
            return;
        }
        if(target<0||start>=candidates.length)
        {
            return;
        }
        for(int i=start;i<candidates.length;i++)
        {
            com.add(candidates[i]);
            backTrack(list,com,i,target-candidates[i],candidates);
            com.remove(com.size()-1);
        }
    }
}