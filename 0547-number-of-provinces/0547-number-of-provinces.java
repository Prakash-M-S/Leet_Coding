class Solution {
    private void dfs(int n,int city,int isConnected[][],boolean visited[])
    {
        visited[city]=true;
        for(int i=0;i<n;i++)
        {
            if(!visited[i]&&isConnected[city][i]==1)
            {
                dfs(n,i,isConnected,visited);

            }

        }

    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int province=0;
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(!visited[i])
            {
                province++;
                dfs(n,i,isConnected,visited);
            }
        }
        return province;
    }
}