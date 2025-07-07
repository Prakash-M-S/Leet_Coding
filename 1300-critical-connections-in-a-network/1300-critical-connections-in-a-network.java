class Solution {
    private int timer=1;
    public void dfs(int start ,int parent ,List<List<Integer>> list,int[] vis,int[] tin,int[] low,List<List<Integer>> result)
    {
        vis[start]=1;
        tin[start]=low[start]=timer;
        timer++;
        for(Integer it:list.get(start))
        {
            if(it==parent) continue;
            if(vis[it]==0)
            {
                dfs(it,start,list,vis,tin,low,result);
                low[start]=Math.min(low[start],low[it]);
                if(low[it]>tin[start])
                {
                    result.add(Arrays.asList(it,start));
                }
            }
            else
            {
                low[start]=Math.min(low[start],low[it]);
            }
        }
        
    }
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>> list= new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            list.add(new ArrayList<Integer>());
        }
        for(List<Integer> temp:connections)
        {
            int u =temp.get(0);
            int v=temp.get(1);
            list.get(v).add(u);
            list.get(u).add(v);

        }
        int vis[]= new int[n];
        int tin[]=new int[n];
        int low[]=new int[n];

        List<List<Integer>> result= new ArrayList<>();
        dfs(0,-1,list,vis,tin,low,result);
        return result;
    }
}