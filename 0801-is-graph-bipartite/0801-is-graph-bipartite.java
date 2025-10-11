class Solution {
    public boolean isBipartite(int[][] graph) {
        int V=graph.length;
        if(V<=2)
        {
            return true;
        }
        char ch[]=new char[V];
        Arrays.fill(ch,'U');
        Queue<Integer> q=new LinkedList<>();
        for(int i =0;i<V;i++)
        {
            if(ch[i]=='U')
            {
                q.offer(i);
                ch[i]='B';
        while(!q.isEmpty())
        {
            int curr=q.poll();
            char color=ch[curr]=='B'?'W':'B';
            for(int nei:graph[curr])
            {
                if(ch[nei]=='U')
                {
                    ch[nei]=color;
                    q.offer(nei);
                }
                else if(ch[nei]==ch[curr])

                {
                    return false;
                    
                }
                else
                {
                    continue;
                }
            }
        }
        }
        }
        return true;
    }
}