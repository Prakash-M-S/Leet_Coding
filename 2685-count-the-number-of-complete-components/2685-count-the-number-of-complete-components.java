class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            list.add(new ArrayList<>());
        }
        for(int edge[]:edges)
        {
            int u=edge[0];
            int v=edge[1];
            list.get(u).add(v);
            list.get(v).add(u);
        }
        int ans=0;
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(!vis[i])
            {
                int nCount=0;
                int eCount =0;
                q.add(i);
                vis[i]=true;

                while(!q.isEmpty())
                {
                    int node=q.poll();
                    nCount++;
                    for(int nei:list.get(node))
                    {
                        if(!vis[nei])
                        {
                            vis[nei]=true;
                            q.add(nei);
                        }
                        eCount++;
                    }
                }
                System.out.println(i+" "+nCount+" "+eCount);
                ans+=(nCount*(nCount-1)/2)==(eCount/2)?1:0;
            }

        }
        return ans;
        
    }
}