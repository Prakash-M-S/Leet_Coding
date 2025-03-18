class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> comb=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        backTrack(comb,list,1,n,k);
        return comb;
    }
    public void backTrack(List<List<Integer>> comb,List<Integer> list,int s,int n,int k)
    {
        if(list.size()==k)
        {
            comb.add(new ArrayList<>(list));
            return;
        }
        for(int i=s;i<=n;i++)
        {
            list.add(i);
            backTrack(comb,list,i+1,n,k);
            list.remove(list.size()-1);
        }
    }
}