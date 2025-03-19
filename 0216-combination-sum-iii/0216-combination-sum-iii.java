class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> comb=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        recursion(comb,list,k,n,1,0);
        return comb;
    }
    public void recursion(List<List<Integer>> comb,List<Integer> list, int k,int n,int i,int sum)
    {
        if(list.size()==k && sum==n)
        {
        comb.add(new ArrayList<>(list));

        return;
        } 
        else if(list.size()==k)
        {
            return;
        }
        for(int j=i;j<=9;j++)
        {
            sum+=j;
            list.add(j);
            recursion(comb,list,k,n,j+1,sum);
            sum-=j;
            list.remove(list.size()-1);
        }
    }
}