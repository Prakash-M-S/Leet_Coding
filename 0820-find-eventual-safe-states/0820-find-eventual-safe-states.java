class Solution {
    public boolean dfs(int i,int[] state,int[][] graph)
    {
        if(state[i]!=0)
        {
            return state[i]==2;
        }
        state[i]=1;
        for(int nei:graph[i])
        {
            if(state[nei]==1||!dfs(nei,state,graph))
            {
                return false;
            }
        }
        state[i]=2;
        return true;
        
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int V=graph.length;
        int state[]=new int[V];
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            if(dfs(i,state,graph))
            {
                res.add(i);
            }
            else if (state[i] == 2) { 
        res.add(i);
    }
        }
        return res;
    }
}