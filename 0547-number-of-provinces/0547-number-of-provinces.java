class Solution {
    public void dfs(int VE,int curr,List<List<Integer>> list,boolean[] vis)
    {
        vis[curr]=true;
        for(int cu:list.get(curr))
        {
            if(vis[cu]!=true)
            {
            dfs(VE,cu,list,vis);
            }
            
        }

    }
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> list=new ArrayList<>();
        int VE=isConnected.length;
        for(int i=0;i<=VE;i++)
        {
            list.add(new ArrayList<Integer>());
        }
        for(int i=1;i<=VE;i++)
        {
            for(int j=1;j<=VE;j++)
            {

                if(isConnected[i-1][j-1]==1)
                {
                    int u=i;
                    int v=j;
                    list.get(u).add(v);
                    list.get(v).add(u);
                }
            }
        }
        int count=0;
        boolean vis[]=new boolean[VE+1];
        for(int i=1;i<=VE;i++)
        {
            if(!vis[i])
            {
                count++;
                dfs(VE,i,list,vis);
            }
        }
        return count;
    }
}